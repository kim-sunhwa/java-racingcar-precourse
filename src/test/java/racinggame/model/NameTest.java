package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {
	@DisplayName("이름 입력 테스트")
	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	void input_name_test() {
		String name = "pobi";
		Name expected = new Name(name);
		assertThat(expected.getName()).isEqualTo(name);
	}
}
