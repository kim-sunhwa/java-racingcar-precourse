package racinggame.controller;

import static racinggame.commons.response.ErrorCode.*;
import static racinggame.commons.response.RacingCode.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import nextstep.utils.Console;
import racinggame.commons.exceptions.BaseException;
import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.model.Name;

public class CarsInfo {
	private final Validator validator;

	public CarsInfo(Validator validator) {
		this.validator = validator;
	}

	public String isValidNames() {
		String names = "";
		boolean isValid = false;
		while (!isValid) {
			names = countOfInputNamesAndIsDuplicated();
			isValid = isValidCarName(names, isValid);
		}
		return names;
	}

	private String[] splitNames(String text) {
		return text.split(NAME_DISTINGUISHER);
	}

	private String countOfInputNamesAndIsDuplicated() {
		boolean isValid = false;
		String inputNames = "";
		while (!isValid) {
			inputNames = requestInputCarNames();
			String[] splitNames = splitNames(inputNames);
			boolean isValidCount = isCountOfCar(splitNames);
			boolean isDuplicated = isDuplicated(splitNames);
			isValid = (isValidCount && isDuplicated);
		}
		return inputNames;
	}

	private boolean isCountOfCar(String[] splitNames) {
		if (splitNames.length < 2) {
			Message.send(NOT_INPUT_CAR_NAMES_TWO_OR_MORE);
			return false;
		}
		return true;
	}

	private boolean isDuplicated(String[] splitNames) {
		Set<String> uniqueNamed = new HashSet<>(Arrays.asList(splitNames));
		boolean result = uniqueNamed.size() == splitNames.length;
		if (!result) {
			Message.send(NOT_INPUT_DUPLICATED_CAR_NAMES);
		}
		return result;
	}

	private boolean isValidCarName(String names, boolean isValid) {
		try {
			isValid = isCarNames(names);
		} catch (BaseException exception) {
			Message.send(exception.getMessage());
		}
		return isValid;
	}

	private boolean isCarNames(String names) {
		String[] arr = splitNames(names);
		for (String name : arr) {
			validator.of(new Name(name));
		}
		return true;
	}

	private String requestInputCarNames() {
		Message.requestCarNames();
		return Console.readLine();
	}

}
