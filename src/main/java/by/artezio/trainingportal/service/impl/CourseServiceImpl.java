package by.artezio.trainingportal.service.impl;

import by.artezio.trainingportal.dao.CourseDao;
import by.artezio.trainingportal.model.Course;
import by.artezio.trainingportal.service.AbstractSpringService;
import by.artezio.trainingportal.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * Created by user on 05.03.2015.
 */
@Service
public class CourseServiceImpl extends AbstractSpringService<CourseDao, Course> implements CourseService {
}
