package racinggame.commons.response;

public enum ErrorCode {
	ERROR("[ERROR]"),
	INVALID_BLANK("[ERROR] 공백을 허용하지 않습니다.");

	private String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
