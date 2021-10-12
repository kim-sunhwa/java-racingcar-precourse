package racinggame.commons.validations;

import static racinggame.commons.validations.Validator.ValidType.*;

import java.util.Objects;

import racinggame.commons.exceptions.InvalidBlankException;
import racinggame.commons.utils.ValidatorTypecasting;

public class NotBlankValidator {
	private NotBlankValidator() {
	}

	public static void of(NotBlank clazz, Object verifyData) {
		NotBlankValidator validator = new NotBlankValidator();
		ValidatorTypecasting validTypes = ValidatorTypecasting.of(clazz.isChecklist());

		if (validTypes.exist(NULL)) {
			validator.isNull(verifyData);
		}
		if (validTypes.exist(BLANK_SPACE)) {
			String validText = String.valueOf(verifyData);
			validator.isBlankSpace(validText);
		}
	}

	private void isNull(Object verifyData) {
		if (Objects.isNull(verifyData)) {
			throw new InvalidBlankException();
		}
	}

	private void isBlankSpace(String validText) {
		if (validText.isEmpty() || validText.trim().isEmpty()) {
			throw new InvalidBlankException();
		}
	}
}
