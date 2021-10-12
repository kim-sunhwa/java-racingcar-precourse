package racinggame.commons.response;

public interface RacingCode {
	String REQUEST_CAR_NAME_LIST = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)";
	String REQUEST_CYCLE = "시도할 회수는 몇회인가요?";

	String INPUT_NAMES_SPLIT_REGEX = ",";
	String NUMBER_REGEX = "[+-]?\\d*(\\.\\d+)?";
}
