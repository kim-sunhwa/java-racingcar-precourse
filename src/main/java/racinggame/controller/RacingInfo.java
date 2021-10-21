package racinggame.controller;

import static racinggame.commons.response.ErrorCode.*;

import nextstep.utils.Console;
import racinggame.commons.exceptions.BaseException;
import racinggame.commons.exceptions.InvalidTypeException;
import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.model.Cycle;

public class RacingInfo {
	private final Validator validator;

	public RacingInfo(Validator validator) {
		this.validator = validator;
	}

	public Cycle ready() {
		try {
			String response = requestCycle();
			isNumber(response);
			int cycle = Integer.parseInt(response);
			isValidRange(cycle);
			return new Cycle(cycle);
		} catch (BaseException exception) {
			Message.send(exception.getMessage());
			return ready();
		}
	}

	private String requestCycle() {
		Message.requestCycle();
		return Console.readLine();
	}

	private void isNumber(String cycleStr) {
		if (!Validator.isNumber(cycleStr)) {
			throw new InvalidTypeException(INVALID_TYPE_OF_NUMBER);
		}
	}

	private void isValidRange(int number) {
		validator.of(new Cycle(number));
	}

}
