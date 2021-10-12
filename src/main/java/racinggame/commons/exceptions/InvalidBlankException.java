package racinggame.commons.exceptions;

import static racinggame.commons.response.ErrorCode.*;

public class InvalidBlankException extends BaseException {
	public InvalidBlankException() {
		super(INVALID_BLANK);
	}
}
