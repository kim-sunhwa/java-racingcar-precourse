package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.commons.exceptions.InvalidBlankException;
import racinggame.commons.exceptions.InvalidLengthException;
import racinggame.commons.response.ErrorCode;
import racinggame.commons.validations.Validator;

public class NameTest {
	@DisplayName("이름 입력 테스트")
	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	void input_name_test() {
		String name = "pobi";
		Name expected = new Name(name);
		assertThat(expected.getName()).isEqualTo(name);
	}

	@Test
	@DisplayName("이름 null 에러 발생 테스트")
	void input_name_null_exception_test() {
		Validator validator = new Validator();
		assertThatExceptionOfType(InvalidBlankException.class)
			.isThrownBy(() -> validator.of(new Name(null)))
			.withMessageContaining(ErrorCode.INVALID_BLANK.getMessage());
	}

	@Test
	@DisplayName("이름 5자 이상 에러 발생 테스트")
	void input_name_long_length_exception_test() {
		Validator validator = new Validator();
		assertThatExceptionOfType(InvalidLengthException.class)
			.isThrownBy(() -> validator.of(new Name("sunhwa")))
			.withMessageContaining("[ERROR]");
	}
}
