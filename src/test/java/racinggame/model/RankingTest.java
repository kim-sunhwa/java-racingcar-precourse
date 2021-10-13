package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racinggame.controller.Winners;

public class RankingTest {
	public static final String FIND_TEXT = "Winner";
	private Cars cars = getCarsAfterRacing();

	@Test
	@DisplayName("자동차 경주 우숭자 명단")
	void result_of_car_racing_ranking_test() {
		Ranking ranking = Ranking.of(getCarsAfterRacing(), new Winners());
		String expected = ranking.top();
		String winners = getWinnerNames(ranking);
		assertThat(winners.contains(expected)).isTrue();
	}

	private String getWinnerNames(Ranking ranking) {
		String winnerText = ranking.toString();
		return winnerText.substring(winnerText.indexOf(FIND_TEXT));
	}

	private Cars getCarsAfterRacing() {
		Cars cars = CarsTest.getCars();
		int cycle = 10;
		while (cycle-- > 0) {
			for (Car car : cars.records()) {
				car.running();
			}
		}
		return cars;
	}
}
