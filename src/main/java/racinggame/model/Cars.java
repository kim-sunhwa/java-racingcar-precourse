package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> cars = new ArrayList<>();

	Cars() {
	}

	public void add(Car car) {
		this.cars.add(car);
	}

	public List<Car> records() {
		return this.cars;
	}

	public String areRacing() {
		StringBuilder sb = new StringBuilder();
		for (Car car : cars) {
			car.running();
			sb.append(car.record());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Cars{" +
			"cars=" + cars +
			'}' + System.lineSeparator();
	}
}
