package by.artezio.trainingportal.web.controller;

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
        return new ModelAndView("main");
    }
}
