package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.dao.CourseDao;
import by.artezio.trainingportal.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user on 05.03.2015.
 */
@Repository
@Transactional
public class CourseDaoImpl extends AbstractHibernateDao<Course> implements CourseDao {
}
