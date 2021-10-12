package racinggame.commons.response;

public enum ErrorCode {
	ERROR("[ERROR]"),
	INVALID_BLANK("[ERROR] 공백을 허용하지 않습니다."),
	INVALID_PATTERN_NAME("[ERROR] 자동차 이름은 한글,영어대소문자,숫자로 입력하세요."),
	NOT_INPUT_CAR_NAMES_TWO_OR_MORE("[ERROR] 경주를 위해 2대이상의 이름을 입력 하세요."),
	NOT_INPUT_DUPLICATED_CAR_NAMES("[ERROR] 자동차 이름은 중복 될 수 없습니다."),
	;

	private String message;

	ErrorCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
