package racinggame.model;

import static racinggame.commons.response.RacingCode.*;

public class CarsFactory {
	private CarsFactory() {
	}

	public static Cars from(String names) {
		String[] splitNames = names.split(NAME_DISTINGUISHER);
		Cars cars = new Cars();
		for (String name : splitNames) {
			Car car = new Car(new Name(name));
			cars.add(car);
		}
		return cars;
	}
}
