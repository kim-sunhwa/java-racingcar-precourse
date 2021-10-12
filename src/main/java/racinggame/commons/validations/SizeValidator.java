package racinggame.commons.validations;

import static racinggame.commons.validations.Validator.ValidType.*;

import racinggame.commons.exceptions.InvalidLengthException;
import racinggame.commons.utils.ValidatorTypecasting;

public class SizeValidator {
	private static final String SIZE_MESSAGE_FORMAT = "%s %d이상 %d이하의 길이여야 합니다.";

	public static void of(Object verify, Size clazz) {
		ValidatorTypecasting typecasting = ValidatorTypecasting.of(clazz.isChecklist());
		if (typecasting.exist(LENGTH)) {
			isValidTextLength(verify, clazz);
		}
	}

	private static void isValidTextLength(Object verify, Size clazz) {
		int min = clazz.min();
		int max = clazz.max();
		int length = getLength(verify);
		String message = String.format(SIZE_MESSAGE_FORMAT, clazz.prefix(), min, max);
		if (length < min || length > max) {
			throw new InvalidLengthException(message);
		}
	}

	private static int getLength(Object verify) {
		return String.valueOf(verify).trim().length();
	}
}
