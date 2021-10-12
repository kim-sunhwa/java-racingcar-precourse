package racinggame.commons.response;

public enum ErrorCode {
	ERROR("[ERROR]"),
	INVALID_BLANK("[ERROR] 공백을 허용하지 않습니다."),
	INVALID_CAR_NAME_LENGTH("[ERROR] 자동차 이름은 1글자 이상, 5글자 이하입니다.");

	private String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
