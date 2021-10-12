package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CycleTest {
	@Test
	@DisplayName("경주 횟수 입력 테스트")
	void input_valid_racing_cycle_test() {
		int number = 3;
		Cycle expected = getCycle(number);
		assertThat(expected).isNotNull();
		assertThat(expected.isRunning()).isTrue();
	}

	private Cycle getCycle(int number) {
		return new Cycle(number);
	}
}
