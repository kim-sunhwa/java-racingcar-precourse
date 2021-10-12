package racinggame;

import racinggame.commons.validations.Validator;
import racinggame.controller.CarsInfo;
import racinggame.controller.RacingInfo;
import racinggame.model.Cycle;

public class Application {
	public static void main(String[] args) {
		// TODO 자동차 경주 게임 구현
		Validator validator = new Validator();
		CarsInfo carsInfo = new CarsInfo(validator);
		String inputCarNames = carsInfo.isValidNames();

		RacingInfo racingInfo = new RacingInfo(validator);
		Cycle ready = racingInfo.ready();
		System.out.println(inputCarNames);
		System.out.println(ready);
	}
}
