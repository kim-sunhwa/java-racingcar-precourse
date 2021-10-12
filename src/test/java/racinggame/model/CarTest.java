package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	private static final String carName = "gong";
	private static Car car = getCar(carName);

	public static Car getCar(String name) {
		return new Car(new Name(name));
	}

	@Test
	@DisplayName("자동차 생성 확인")
	void createCarTest() {
		Car car = getCar(carName);
		assertThat(car.getName()).isEqualTo(carName);
	}
}
