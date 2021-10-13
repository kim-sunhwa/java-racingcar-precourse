package racinggame.controller;

import static racinggame.commons.response.ErrorCode.*;

import nextstep.utils.Console;
import racinggame.commons.exceptions.BaseException;
import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.model.Cycle;

public class RacingInfo {
	private final Validator validator;

	public RacingInfo(Validator validator) {
		this.validator = validator;
	}

	public Cycle ready() {
		boolean isValid = false;
		int number = -1;
		while (!isValid) {
			number = isValidTypeNumber();
			isValid = isValidRangeOfNumber(new Cycle(number));
		}
		return new Cycle(number);
	}

	private boolean isValidRangeOfNumber(Cycle cycle) {
		try {
			validator.of(cycle);
			return true;
		} catch (BaseException exception) {
			Message.send(exception.getMessage());
			return false;
		}
	}

	private int isValidTypeNumber() {
		boolean isValid = false;
		String cycleStr = "";
		while (!isValid) {
			Message.requestCycle();
			cycleStr = Console.readLine();

			isValid = isNumber(cycleStr);
		}
		return Integer.parseInt(cycleStr);
	}

	private boolean isNumber(String cycleStr) {
		boolean isValid = Validator.isNumber(cycleStr);
		if (!isValid) {
			Message.send(INVALID_TYPE_OF_NUMBER);
		}
		return isValid;
	}
}
