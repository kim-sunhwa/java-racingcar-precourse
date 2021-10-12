package racinggame.commons.exceptions;

import static racinggame.commons.response.ErrorCode.*;

public class InvalidPatternException extends BaseException {
	public InvalidPatternException() {
		super(INVALID_PATTERN_NAME);
	}
}
