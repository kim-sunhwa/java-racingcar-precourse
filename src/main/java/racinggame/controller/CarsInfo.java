package racinggame.controller;

import static racinggame.commons.response.ErrorCode.*;
import static racinggame.commons.response.RacingCode.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import nextstep.utils.Console;
import racinggame.commons.exceptions.BaseException;
import racinggame.commons.exceptions.InvalidNumberOfRacers;
import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.model.Name;

public class CarsInfo {
	private final Validator validator;

	public CarsInfo(Validator validator) {
		this.validator = validator;
	}

	public String listOfCarNames() {
		try {
			String carNames = requestCarNames();
			isValid(carNames);
			return carNames;
		} catch (BaseException exception) {
			Message.send(exception.getMessage());
			return listOfCarNames();
		}
	}

	private String requestCarNames() {
		Message.requestCarNames();
		return Console.readLine();
	}

	private void isValid(String carNames) {
		String[] names = splitNames(carNames);
		isCountOfCar(names);
		isDuplicated(names);
		isValidCarNames(names);
	}

	private String[] splitNames(String text) {
		return text.split(NAME_DISTINGUISHER);
	}

	private void isCountOfCar(String[] splitNames) {
		if (splitNames.length < 2) {
			throw new InvalidNumberOfRacers();
		}
	}

	private void isDuplicated(String[] splitNames) {
		Set<String> uniqueNamed = new HashSet<>(Arrays.asList(splitNames));
		if (uniqueNamed.size() != splitNames.length) {
			throw new InvalidNumberOfRacers(NOT_INPUT_DUPLICATED_CAR_NAMES);
		}
	}

	private void isValidCarNames(String[] names) {
		for (String name : names) {
			validator.of(new Name(name));
		}
	}
}
