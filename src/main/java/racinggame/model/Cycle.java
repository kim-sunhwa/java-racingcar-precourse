package racinggame.model;

import racinggame.commons.validations.Digit;

public class Cycle {
	@Digit(min = 3, max = 9, prefix = "[ERROR]")
	private int cycle;

	public Cycle(int cycle) {
		this.cycle = cycle;
	}

	public boolean isRunning() {
		return this.cycle > 0;
	}
}
