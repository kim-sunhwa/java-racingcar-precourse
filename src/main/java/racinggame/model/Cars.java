package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> cars = new ArrayList<>();

	public void add(Car car) {
		this.cars.add(car);
	}

	public List<Car> records() {
		return this.cars;
	}

	@Override
	public String toString() {
		return "Cars{" +
			"cars=" + cars +
			'}';
	}
}
