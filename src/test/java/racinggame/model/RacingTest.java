package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RacingTest {
	@RepeatedTest(5)
	@DisplayName("자동차 전진 조건 0-9 범위 확인 테스트")
	void range_of_number_for_car_forward_test() {
		Racing racing = new Racing();
		racing.isForward();
		assertThat(racing.getDistance()).isGreaterThan(-1);
		assertThat(racing.getDistance()).isLessThan(10);
	}
}
