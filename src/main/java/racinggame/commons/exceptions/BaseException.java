package racinggame.commons.exceptions;

import racinggame.commons.response.ErrorCode;

public class BaseException extends RuntimeException {
	private ErrorCode errorCode;

	public BaseException() {
	}

	public BaseException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public BaseException(String message) {
		super(message);
	}
}
