package by.artezio.trainingportal.web.controller;

import by.artezio.trainingportal.model.Entrepreneur;
import by.artezio.trainingportal.model.Organization;
import by.artezio.trainingportal.model.User;
import by.artezio.trainingportal.service.EntrepreneurService;
import by.artezio.trainingportal.service.OrganizationService;
import by.artezio.trainingportal.utils.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 04.03.2015.
 */
@Controller
public class HelloController {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private EntrepreneurService entrepreneurService;

    @RequestMapping(value = "/main.html", params = {"enabled"})
    public ModelAndView hello(@RequestParam(value = "enabled", required = false) boolean enabled) {
        ModelAndView modelAndView = new ModelAndView("main");
        Object currentUser =  SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (currentUser instanceof UserDetails) {
            User user = ((CustomUserDetails)currentUser).getUser();
            modelAndView.addObject("currentUser", user.getName());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/inheritance.html")
    public ModelAndView inheritance() {
        ModelAndView modelAndView = new ModelAndView("main");
        Organization organization = new Organization();
        organization.setOrganizationName("Test organization");
        organization.setInnNumber("124141441");
        organization.setKppNumber("124151251");
        organization.setRegistrationDate(new Date());
//            organization.setGuid(UUID.randomUUID().toString());

        organizationService.save(organization);

        Entrepreneur entrepreneur = new Entrepreneur();
        entrepreneur.setRegistrationDate(new Date());
        entrepreneur.setInnNumber("81725151");
//            String entrepreneurGuid = UUID.randomUUID().toString();
//            entrepreneur.setGuid(entrepreneurGuid);
        entrepreneur.setFirstname("Test firstname");
        entrepreneur.setSurname("Test surname");
        entrepreneur.setMiddlename("Test middlename");
        entrepreneur.setKppNumber("261987122");

        entrepreneurService.save(entrepreneur);
        List<Entrepreneur> all = entrepreneurService.getAll();
        Entrepreneur oldEntrepreneur = all.get(0);
        oldEntrepreneur.setSurname("Updated Test surname");
        entrepreneurService.save(oldEntrepreneur);
        return modelAndView;
    }
}
