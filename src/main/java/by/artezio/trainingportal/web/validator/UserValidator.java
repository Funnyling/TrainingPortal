package by.artezio.trainingportal.web.validator;

import by.artezio.trainingportal.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by user on 07.03.2015.
 */
@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "required.login");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required.email");
        User user = (User) target;
    }
}
