package racinggame.commons.exceptions;

import static racinggame.commons.response.ErrorCode.*;

import racinggame.commons.response.ErrorCode;

public class InvalidTypeException extends BaseException {
	public InvalidTypeException() {
		super(ERROR);
	}

	public InvalidTypeException(ErrorCode errorCode) {
		super(errorCode);
	}
}
