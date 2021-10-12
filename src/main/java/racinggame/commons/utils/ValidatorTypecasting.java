package racinggame.commons.utils;

import java.util.Arrays;
import java.util.HashSet;

import racinggame.commons.validations.Validator;

public class ValidatorTypecasting {
	private HashSet<Validator.ValidType> validTypes;

	public static ValidatorTypecasting of(Validator.ValidType[] arr) {
		ValidatorTypecasting typecasting = new ValidatorTypecasting();
		typecasting.validTypes = new HashSet<>(Arrays.asList(arr));
		return typecasting;
	}

	public boolean exist(Validator.ValidType type) {
		return this.validTypes.contains(type);
	}
}
