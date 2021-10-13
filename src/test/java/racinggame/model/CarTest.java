package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static racinggame.commons.response.RacingCode.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	private static final String carName = "gong";
	private static Car carTest = getCar(carName);

	public static Car getCar(String name) {
		return new Car(new Name(name));
	}

	@Test
	@DisplayName("자동차 생성")
	void createCarTest() {
		Car car = getCar(carName);
		assertThat(car.getName()).isEqualTo(carName);
	}

	@Test
	@DisplayName("자동차 전진 또는 멈춤 포맷팅")
	void car_forward_or_stop_format_test() {
		String name = "name";
		Car car = new Car(new Name(name));
		car.running();
		assertThat(car.record().indexOf(name)).isZero();
		assertThat(car.record().indexOf(COLON_FORMAT)).isNotZero();
	}
}
