package racinggame.model;

import racinggame.commons.validations.Digit;

public class Cycle {
	@Digit(min = 1, max = 20, prefix = "[ERROR]")
	private int cycle;

	public Cycle(int cycle) {
		this.cycle = cycle;
	}

	public boolean isRunning() {
		return this.cycle > 0;
	}

	public void turnAround() {
		if (this.cycle < 1) {
			return;
		}
		this.cycle--;
	}
	
	@Override
	public String toString() {
		return "Cycle{" +
			"cycle=" + cycle +
			'}';
	}

}
