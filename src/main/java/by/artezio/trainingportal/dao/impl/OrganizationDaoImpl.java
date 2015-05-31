package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.OrganizationDao;
import by.artezio.trainingportal.model.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user on 31.05.2015.
 */
@Repository
@Transactional
public class OrganizationDaoImpl extends AbstractHibernateDao<Organization> implements OrganizationDao {
}
