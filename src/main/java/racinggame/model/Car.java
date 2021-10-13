package racinggame.model;

import static racinggame.commons.response.RacingCode.*;

public class Car {
	private Name name;
	private Racing racing = new Racing();

	public Car(Name name) {
		this.name = name;
		this.racing = new Racing();
	}

	public void running() {
		this.racing.isForward();
	}

	public String record() {
		StringBuilder sb = new StringBuilder();
		int distance = racing.getDistance();
		sb.append(name.getName()).append(COLON_FORMAT);
		while (distance-- > 0) {
			sb.append(CAR_FORWARD_FORMAT);
		}
		return sb.toString();
	}

	public String getName() {
		return this.name.getName();
	}

	void setRacing(Racing racing) {
		this.racing = racing;
	}

	@Override
	public String toString() {
		return "Car{" +
			"name=" + name +
			'}';
	}
}
