package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define default course code (if they don't pass a value)
    public String value() default "LUV";

    //defint default error message
    public String message() default "must start with LUV";

    //define default groups (can group related constraints)
    public Class<?>[] groups() default{};

    //define default payloads (provide custom details about
    // validation failure(security level, error code, etc.))
    public Class<? extends Payload>[] payload() default {};

}
