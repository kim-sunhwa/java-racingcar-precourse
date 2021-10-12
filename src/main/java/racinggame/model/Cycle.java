package racinggame.model;

public class Cycle {
	private int cycle;

	public Cycle(int cycle) {
		this.cycle = cycle;
	}

	public boolean isRunning() {
		return this.cycle > 0;
	}
}
