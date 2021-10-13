package racinggame;

import racinggame.commons.response.Message;
import racinggame.commons.validations.Validator;
import racinggame.controller.CarsInfo;
import racinggame.controller.RacingInfo;
import racinggame.model.Car;
import racinggame.model.Cars;
import racinggame.model.CarsFactory;
import racinggame.model.Cycle;

public class Application {
	public static void main(String[] args) {
		// TODO 자동차 경주 게임 구현
		Validator validator = new Validator();
		CarsInfo carsInfo = new CarsInfo(validator);
		String inputCarNames = carsInfo.isValidNames();

		RacingInfo racingInfo = new RacingInfo(validator);
		Cycle cycle = racingInfo.ready();
		System.out.println(inputCarNames);
		System.out.println(cycle);

		Cars cars = CarsFactory.from(inputCarNames);
		System.out.println(cars);

		Message.running();
		cars.isRacing();
		for (Car racingCar : cars.records()) {
			System.out.println(racingCar.record());
		}
	}
}
