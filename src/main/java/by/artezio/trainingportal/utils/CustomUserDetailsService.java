package by.artezio.trainingportal.utils;

import by.artezio.trainingportal.model.User;
import by.artezio.trainingportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by user on 08.03.2015.
 */
//@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findUserByLogin(s);
        UserDetails userDetails = new CustomUserDetails(user);
        if (user == null) {
            throw new UsernameNotFoundException("User with " + s + " not found");
        }
        return userDetails;
    }
}
