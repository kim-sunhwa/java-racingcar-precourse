package racinggame.commons.validations;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static racinggame.commons.validations.Validator.ValidType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(FIELD)
@Retention(RUNTIME)
public @interface Pattern {
	String regex() default "";

	Validator.ValidType[] isChecklist() default {SPECIAL_CHARACTER};
}
