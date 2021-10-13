package racinggame.controller;

import java.util.ArrayList;
import java.util.List;

public class Winners {
	private List<String> winners = new ArrayList<>();

	public void record(boolean isWinner, String name) {
		if (isWinner) {
			this.winners.add(name);
		}
	}

	public String names() {
		return String.join(", ", this.winners);
	}

	@Override
	public String toString() {
		return "Winners{" +
			"winners=" + names() +
			'}';
	}
}
