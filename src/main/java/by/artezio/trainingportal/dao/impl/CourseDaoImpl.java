package by.artezio.trainingportal.dao.impl;

import by.artezio.trainingportal.dao.AbstractHibernateDao;
import by.artezio.trainingportal.model.Course;
import by.artezio.trainingportal.service.CourseService;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 05.03.2015.
 */
@Repository
public class CourseDaoImpl extends AbstractHibernateDao<Course> implements CourseService {
}
