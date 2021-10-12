package racinggame.commons.validations;

import static racinggame.commons.validations.Validator.ValidType.*;

import racinggame.commons.exceptions.InvalidPatternException;
import racinggame.commons.utils.ValidatorTypecasting;

public class PatternValidator {
	public static void of(Object verify, Pattern clazz) {
		ValidatorTypecasting typecasting = ValidatorTypecasting.of(clazz.isChecklist());
		String regex = clazz.regex();
		String text = String.valueOf(verify);

		if (typecasting.exist(SPECIAL_CHARACTER)) {
			isMatch(regex, text);
		}
	}

	private static void isMatch(String regex, String text) {
		boolean matches = text.trim().matches(regex);
		if (!matches) {
			throw new InvalidPatternException();
		}
	}
}
