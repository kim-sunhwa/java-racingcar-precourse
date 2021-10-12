package racinggame.commons.validations;

import static racinggame.commons.response.ErrorCode.*;
import static racinggame.commons.response.RacingCode.*;

import java.lang.reflect.Field;

import racinggame.commons.response.Message;

public class Validator<T> {
	public enum ValidType {NULL, BLANK_SPACE, LENGTH, SPECIAL_CHARACTER, TYPE_NUMBER, RANGE}

	public void of(T data) {
		Field[] fields = data.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			Object verify = getObject(data, field);

			isBlank(field, verify);
			checkSize(field, verify);
			checkPattern(field, verify);
			isDigit(field, verify);
		}
	}

	private void isDigit(Field field, Object verify) {
		if (field.isAnnotationPresent(Digit.class)) {
			Digit clazz = field.getAnnotation(Digit.class);
			DigitValidator.of((int)verify, clazz);
		}
	}

	private void checkPattern(Field field, Object verify) {
		if (field.isAnnotationPresent(Pattern.class)) {
			Pattern clazz = field.getAnnotation(Pattern.class);
			PatternValidator.of(verify, clazz);
		}
	}

	private void checkSize(Field field, Object verify) {
		if (field.isAnnotationPresent(Size.class)) {
			Size clazz = field.getAnnotation(Size.class);
			SizeValidator.of(verify, clazz);
		}
	}

	private void isBlank(Field field, Object verifyData) {
		if (field.isAnnotationPresent(NotBlank.class)) {
			NotBlank notBlank = field.getAnnotation(NotBlank.class);
			NotBlankValidator.of(notBlank, verifyData);
		}
	}

	public static boolean isNumber(String verify) {
		return verify.matches(NUMBER_REGEX);
	}

	private Object getObject(T data, Field field) {
		Object object = null;
		try {
			object = field.get(data);
			return object;
		} catch (IllegalAccessException e) {
			Message.send(ERROR);
		}
		return null;
	}

}
