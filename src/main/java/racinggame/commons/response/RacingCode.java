package racinggame.commons.response;

public interface RacingCode {
	String REQUEST_CAR_NAME_LIST = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)";
	String REQUEST_CYCLE = "시도할 회수는 몇회인가요?";
	String RACING_RUNNING_RESULT = "실행결과";

	// 레이싱 규칙
	String
		INPUT_NAMES_SPLIT_REGEX = ",";
	String NUMBER_REGEX = "[+-]?\\d*(\\.\\d+)?";
	String COLON_FORMAT = " : ";
	String CAR_FORWARD_FORMAT = "-";
	int CAR_MOVE_RANGE_MIN = 0;
	int CAR_MOVE_RANGE_MAX = 9;
	int STOP_NUMBER = 3;
	int MOVE_FORWARD = 1;
}
