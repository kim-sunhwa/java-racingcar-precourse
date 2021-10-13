package racinggame.model;

import java.util.PriorityQueue;

import racinggame.controller.Winners;

public class Ranking {
	private PriorityQueue<Car> ranking = new PriorityQueue<>((o1, o2) -> o2.distance() - o1.distance());
	private final Winners winners;

	private Ranking(Winners winners) {
		this.winners = winners;
	}

	public static Ranking of(Cars cars, Winners winners) {
		Ranking record = new Ranking(winners);
		for (Car car : cars.records()) {
			record.determine(car);
		}
		return record;
	}

	private void determine(Car car) {
		this.ranking.add(car);
	}

	public String top() {
		return listOfWinners().names();
	}

	private Winners listOfWinners() {
		boolean isTrue = true;
		int win = ranking.peek().distance();
		while (!ranking.isEmpty() && isTrue) {
			isTrue = isWinner(win);
			this.winners.record(isTrue, this.ranking.poll().getName());
		}
		return this.winners;
	}

	private boolean isWinner(int win) {
		if (win > this.ranking.peek().distance()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Ranking{" +
			"winners=" + winners +
			'}';
	}
}
