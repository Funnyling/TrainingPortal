package by.artezio.trainingportal.service.impl;

import by.artezio.trainingportal.dao.UserDao;
import by.artezio.trainingportal.model.User;
import by.artezio.trainingportal.service.AbstractSpringService;
import by.artezio.trainingportal.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user on 05.03.2015.
 */
@Service
public class UserServiceImpl extends AbstractSpringService<UserDao, User> implements UserService {

    @Override
    @Transactional
    public User findUserByLogin(String login) {
        return getDao().findUserByLogin(login);
    }
}
