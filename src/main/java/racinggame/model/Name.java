package racinggame.model;

import racinggame.commons.validations.NotBlank;
import racinggame.commons.validations.Size;

public class Name {
	@NotBlank
	@Size(min = 1, max = 5, prefix = "[ERROR]")
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
