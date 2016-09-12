package com.Ableson.Lab25ValidateUser;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class PersonValidator {
	
	/**
     * This Validator validates *just* Person instances
     */
    public boolean supports(Class<?> clazz) {
        return PersonForm.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
        PersonForm p = (PersonForm) obj;
        if (p.getAge() < 0) {
            e.rejectValue("age", "negativevalue");
        }else if (p.getAge() < 1) {
        	e.rejectValue("age", "too.darn.young");
        } else if (p.getAge() > 110) {
            e.rejectValue("age", "too.darn.old");
        }
    }
}


