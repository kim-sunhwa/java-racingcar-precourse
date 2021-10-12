package racinggame.commons.exceptions;

import static racinggame.commons.response.ErrorCode.*;

public class OutOfRangeException extends BaseException {
	public OutOfRangeException() {
		super(ERROR);
	}

	public OutOfRangeException(String message) {
		super(message);
	}
}
