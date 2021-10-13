package racinggame;

import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.controller.CarsInfo;
import racinggame.controller.Circuit;
import racinggame.controller.RacingInfo;
import racinggame.model.Cars;
import racinggame.model.CarsFactory;
import racinggame.model.Cycle;
import racinggame.model.Ranking;

public class Application {
	public static void main(String[] args) {
		// TODO 자동차 경주 게임 구현
		// view 입력
		Validator validator = new Validator();
		CarsInfo carsInfo = new CarsInfo(validator);
		RacingInfo racingInfo = new RacingInfo(validator);

		String inputCarNames = carsInfo.isValidNames();
		Cycle cycle = racingInfo.ready();
		// 게임 시작/진행 - 출력
		Cars cars = CarsFactory.from(inputCarNames);
		Circuit circuit = new Circuit(cars, cycle);
		circuit.play();
		// 게임 결과 - 출력
		Ranking ranking = Ranking.from(cars);
		Message.winner(ranking.top());
	}
}
