package racinggame.commons.response;

public class Message {

	public static void send(ErrorCode errorCode) {
		System.out.println(errorCode.getMessage());
	}
}
