package racinggame.model;

import java.util.Objects;

import racinggame.commons.exceptions.InvalidBlankException;
import racinggame.commons.validations.NotBlank;
import racinggame.commons.validations.Pattern;
import racinggame.commons.validations.Size;

public class Name {
	@NotBlank
	@Size(min = 1, max = 5, prefix = "[ERROR]")
	@Pattern(regex = "^[가-힣A-Za-z0-9]+$")
	private String name;

	public Name(String name) {
		if (Objects.isNull(name)) {
			throw new InvalidBlankException();
		}
		this.name = name.trim();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name{" +
			"name='" + name + '\'' +
			'}';
	}
}
