package racinggame;

import racinggame.commons.validations.Validator;
import racinggame.controller.CarsInfo;

public class Application {
	public static void main(String[] args) {
		// TODO 자동차 경주 게임 구현
		Validator validator = new Validator();
		CarsInfo carsInfo = new CarsInfo(validator);
		String inputCarNames = carsInfo.isValidNames();
		System.out.println(inputCarNames);
	}
}
