package racinggame.model;

public class Car {
	private Name name;

	Car(Name name) {
		this.name = name;
	}

	public String getName() {
		return this.name.getName();
	}
}
