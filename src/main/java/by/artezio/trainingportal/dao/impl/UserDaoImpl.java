package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.UserDao;
import by.artezio.trainingportal.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 05.03.2015.
 */
@Repository
public class UserDaoImpl extends AbstractHibernateDao<User> implements UserDao {

    @Override
    public User findUserByLogin(String login) {
        Criteria criteria = getSession().createCriteria(getPersistentClass())
                .add(Restrictions.eq("login", login));
        User user = (User) criteria.uniqueResult();
        return user;
    }
}
