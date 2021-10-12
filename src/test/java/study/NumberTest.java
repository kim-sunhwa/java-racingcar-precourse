package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberTest {

	@Test
	void is_number_test() {
		final String VALID_REGEX = "[+-]?\\d*(\\.\\d+)?";
		String number = "1";
		String notNumber = "d";

		assertThat(number.matches(VALID_REGEX)).isTrue();
		assertThat(notNumber.matches(VALID_REGEX)).isFalse();

	}
}
