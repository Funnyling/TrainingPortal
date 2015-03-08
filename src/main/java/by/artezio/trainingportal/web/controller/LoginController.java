package by.artezio.trainingportal.web.controller;

import by.artezio.trainingportal.model.User;
import by.artezio.trainingportal.model.enumeration.UserRole;
import by.artezio.trainingportal.service.UserService;
import by.artezio.trainingportal.web.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 07.03.2015.
 */
@Controller
@SessionAttributes("user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration.html", method = RequestMethod.GET)
    public ModelAndView registrationGet() {
        ModelAndView modelAndView = new ModelAndView("registration/registration");
        User newUser = new User();
        modelAndView.addObject("user", newUser);
        return modelAndView;
    }

    @RequestMapping(value = "/registration.html", method = RequestMethod.POST)
    public ModelAndView registrationPost(@ModelAttribute(value = "user") User user, BindingResult result,  SessionStatus status) {
        ModelAndView modelAndView = new ModelAndView("registration/registration");
        UserValidator validator = new UserValidator();
        validator.validate(user, result);
        if (result.hasErrors()) {
            modelAndView.setViewName("registration/registration");
        } else {
            user.setRole(UserRole.LECTURER);
            userService.save(user);
            status.setComplete();
        }
        return modelAndView;
    }

    @RequestMapping(value = "/signin.html", method = RequestMethod.GET)
    public ModelAndView siginGet(@RequestParam(value = "error", required = false) String error) {
        ModelAndView modelAndView = new ModelAndView("sign/signin");
        if (error != null) {
            modelAndView.addObject("error",error);
        }
        return modelAndView;
    }

}
