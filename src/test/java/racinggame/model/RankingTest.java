package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RankingTest {
	private int winRecord = -1;
	private Cars cars = getCarsAfterRacing();

	@Test
	@DisplayName("자동차 경주 우숭자 기록 확인 테스트")
	void result_of_car_racing_ranking_test() {
		Ranking ranking = Ranking.from(cars);
		String winnerName = topRecord();
		String expected = ranking.top();

		assertThat(expected.contains(winnerName)).isTrue();
	}

	private Cars getCarsAfterRacing() {
		Cars cars = CarsTest.getCars();
		int cycle = 10;
		while (cycle-- > 0) {
			getWinner(cars);
		}
		return cars;
	}

	private void getWinner(Cars cars) {
		for (Car car : cars.records()) {
			car.running();
			winRecord = Math.max(winRecord, car.distance());
		}
	}

	private String topRecord() {
		int cycle = 10;
		while (cycle-- > 0) {
			return getTopCarName();
		}
		return null;
	}

	private String getTopCarName() {
		for (Car car : cars.records()) {
			if (car.distance() == winRecord) {
				return car.getName();
			}
		}
		return null;
	}
}
