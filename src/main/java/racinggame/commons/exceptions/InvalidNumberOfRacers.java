package racinggame.commons.exceptions;

import static racinggame.commons.response.ErrorCode.*;

import racinggame.commons.response.ErrorCode;

public class InvalidNumberOfRacers extends BaseException {
	public InvalidNumberOfRacers() {
		super(NOT_INPUT_CAR_NAMES_TWO_OR_MORE);
	}

	public InvalidNumberOfRacers(ErrorCode errorCode) {
		super(errorCode);
	}
}
