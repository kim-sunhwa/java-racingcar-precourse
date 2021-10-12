package racinggame.commons.validations;

import static racinggame.commons.response.ErrorCode.*;
import static racinggame.commons.validations.Validator.ValidType.*;

import racinggame.commons.exceptions.InvalidTypeException;
import racinggame.commons.exceptions.OutOfRangeException;
import racinggame.commons.utils.ValidatorTypecasting;

public class DigitValidator {
	private static final String MESSAGE_FORMAT = "%s %d ~ %d 범위내 값이어야 합니다.";
	private static final String VALID_REGEX = "[+-]?\\d*(\\.\\d+)?";

	public static void of(int verify, Digit clazz) {
		ValidatorTypecasting typecasting = ValidatorTypecasting.of(clazz.isChecklist());

		if (typecasting.exist(TYPE_NUMBER)) {
			isNumber(verify);
		}
		if (typecasting.exist(RANGE)) {
			isValidRangeOfNumber(verify, clazz);
		}
	}

	private static void isNumber(int verify) {
		String textNumber = String.valueOf(verify);
		if (!textNumber.matches(VALID_REGEX)) {
			throw new InvalidTypeException(INVALID_TYPE_OF_NUMBER);
		}
	}

	private static void isValidRangeOfNumber(int verify, Digit clazz) {
		int min = clazz.min();
		int max = clazz.max();
		String message = String.format(MESSAGE_FORMAT, clazz.prefix(), min, max);
		if (verify < min || verify > max) {
			throw new OutOfRangeException(message);
		}
	}
}
