package racinggame.model;

import static racinggame.commons.response.RacingCode.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Ranking {
	private PriorityQueue<Car> ranking = new PriorityQueue<>((o1, o2) -> o2.distance() - o1.distance());

	public static Ranking from(Cars cars) {
		Ranking record = new Ranking();
		for (Car car : cars.records()) {
			record.determine(car);
		}
		return record;
	}

	private void determine(Car car) {
		this.ranking.add(car);
	}

	public String top() {
		boolean isTrue = true;
		int win = ranking.peek().distance();
		List<String> winners = new ArrayList<>();
		while (!ranking.isEmpty() && isTrue) {
			winners.add(this.ranking.poll().getName());
			isTrue = isWinner(win);
		}
		return String.join(NAME_DISTINGUISHER, winners);
	}

	private boolean isWinner(int win) {
		if (win > this.ranking.peek().distance()) {
			return false;
		}
		return true;
	}
}
