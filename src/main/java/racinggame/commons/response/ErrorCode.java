package racinggame.commons.response;

public enum ErrorCode {
	ERROR("[ERROR]"),
	INVALID_BLANK("[ERROR] 공백을 허용하지 않습니다."),
	INVALID_PATTERN_NAME("[ERROR] 자동차 이름은 한글,영어대소문자,숫자로 입력하세요.");

	private String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
