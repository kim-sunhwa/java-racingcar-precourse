package racinggame.commons.response;

public class Message implements RacingCode {

	public static void requestCarNames() {
		System.out.println(REQUEST_CAR_NAME_LIST);
	}

	public static void requestCycle() {
		System.out.println(REQUEST_CYCLE);
	}

	public static void send(ErrorCode errorCode) {
		System.out.println(errorCode.getMessage());
	}

	public static void send(String text) {
		System.out.println(text);
	}

	public static void running() {
		System.out.println(RACING_RUNNING_RESULT + System.lineSeparator());
	}
}
