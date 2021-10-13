package racinggame.controller;

import racinggame.commons.response.Message;
import racinggame.model.Cars;
import racinggame.model.Cycle;

public class Circuit {
	private final Cars cars;
	private final Cycle cycle;

	public Circuit(Cars cars, Cycle cycle) {
		this.cars = cars;
		this.cycle = cycle;
	}

	public void play() {
		Message.running();
		Message.send(broadcasting());
	}

	private String broadcasting() {
		StringBuilder sb = new StringBuilder();
		while (cycle.isRunning()) {
			sb.append(cars.areRacing());
			sb.append(System.lineSeparator());
			cycle.turnAround();
		}
		return sb.toString();
	}
}
