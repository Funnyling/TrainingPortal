package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.EntrepreneurDao;
import by.artezio.trainingportal.model.Entrepreneur;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user on 31.05.2015.
 */
@Repository
@Transactional
public class EntrepreneurDaoImpl extends AbstractHibernateDao<Entrepreneur> implements EntrepreneurDao {
}
