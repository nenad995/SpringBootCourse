package com.nenad.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //Define default course code
    String value() default "NEX";

    //Define default error message
    String message() default "Code must start with NEX";

    //Define default groups
    Class<?>[] groups() default {};

    //Define default payload
    Class<? extends Payload>[] payload() default {};

}
