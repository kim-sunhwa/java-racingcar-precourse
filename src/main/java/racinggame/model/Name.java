package racinggame.model;

import racinggame.commons.validations.NotBlank;

public class Name {
	@NotBlank
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
