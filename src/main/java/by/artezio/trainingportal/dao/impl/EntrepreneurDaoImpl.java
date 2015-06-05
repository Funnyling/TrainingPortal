package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.EntrepreneurDao;
import by.artezio.trainingportal.model.Entrepreneur;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 31.05.2015.
 */
@Repository
public class EntrepreneurDaoImpl extends AbstractHibernateDao<Entrepreneur> implements EntrepreneurDao {

    @Override
    public Entrepreneur load(String guid) {
        Criteria criteria = getSession().createCriteria(getPersistentClass()).add(Restrictions.eq("guid", guid));
        Entrepreneur entrepreneur = (Entrepreneur) criteria.uniqueResult();
        return entrepreneur;
    }
}
