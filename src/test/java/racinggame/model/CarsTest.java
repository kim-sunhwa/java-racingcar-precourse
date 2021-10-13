package racinggame.model;

import static org.assertj.core.api.Assertions.*;
import static racinggame.model.CarTest.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {
	public static final String POBI = "pobi";
	public static final String CRONG = "crong";
	public static final String GONG = "gong";
	private static String[] listOfName = {POBI, CRONG, GONG};

	@Test
	@DisplayName("자동차 목록 객체 생성 테스트")
	void create_cars_test() {
		Cars cars = getCars();
		assertThat(cars.records().get(0).getName()).isEqualTo(POBI);
	}

	public static Cars getCars() {
		Cars cars = new Cars();
		for (String name : nameList()) {
			Car car = createCar(name);
			cars.add(car);
		}
		return cars;
	}

	private static Car createCar(String name) {
		return getCar(name);
	}

	private static List<String> nameList() {
		return Arrays.asList(listOfName);
	}

}
