package by.artezio.trainingportal.web.controller;

import by.artezio.trainingportal.model.User;
import by.artezio.trainingportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 07.03.2015.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration.html", method = RequestMethod.GET)
    public ModelAndView registrationGet() {
        ModelAndView modelAndView = new ModelAndView("registration/registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration.html", method = RequestMethod.POST)
    public ModelAndView registrationPost(@ModelAttribute(value = "user") User user) {
        ModelAndView modelAndView = new ModelAndView("registration/registration");
        return modelAndView;
    }

}
