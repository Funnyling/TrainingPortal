package by.artezio.trainingportal.web.controller;

import by.artezio.trainingportal.model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 04.03.2015.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/main.html")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("main");
        Object currentUser =  SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (currentUser instanceof UserDetails) {
            String userName = ((User)currentUser).getName();
            modelAndView.addObject("currentUser", userName);
        }
        return modelAndView;
    }
}
