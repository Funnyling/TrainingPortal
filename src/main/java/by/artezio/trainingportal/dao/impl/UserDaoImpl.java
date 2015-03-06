package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.UserDao;
import by.artezio.trainingportal.model.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

/**
 * Created by user on 05.03.2015.
 */
@Repository
public class UserDaoImpl extends AbstractHibernateDao<User> implements UserDao {
}
