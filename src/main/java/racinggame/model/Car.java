package racinggame.model;

public class Car {
	private Name name;

	public Car(Name name) {
		this.name = name;
	}

	public String getName() {
		return this.name.getName();
	}

	@Override
	public String toString() {
		return "Car{" +
			"name=" + name +
			'}';
	}
}
