package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static racinggame.commons.response.ErrorCode.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.commons.exceptions.OutOfRangeException;
import racinggame.commons.validations.Validator;

public class CycleTest {
	@Test
	@DisplayName("경주 횟수 입력 테스트")
	void input_valid_racing_cycle_test() {
		int number = 3;
		Cycle expected = getCycle(number);
		assertThat(expected).isNotNull();
		assertThat(expected.isRunning()).isTrue();
	}

	@DisplayName("경주 횟수 입력 숫자의 범위 예외 발생 테스트")
	@ParameterizedTest
	@ValueSource(ints = {-1, 2, 22})
	void out_of_range_number_in_cycle_exception_test(int number) {
		Validator validator = new Validator();
		assertThatExceptionOfType(OutOfRangeException.class)
			.isThrownBy(() -> validator.of(getCycle(number)))
			.withMessageContaining(ERROR.getMessage());
	}

	private Cycle getCycle(int number) {
		return new Cycle(number);
	}
}
