package by.artezio.trainingportal.service.impl;

import by.artezio.trainingportal.dao.EntrepreneurDao;
import by.artezio.trainingportal.model.Entrepreneur;
import by.artezio.trainingportal.service.AbstractSpringService;
import by.artezio.trainingportal.service.EntrepreneurService;
import org.springframework.stereotype.Service;

/**
 * Created by user on 31.05.2015.
 */
@Service
public class EntrepreneurServiceImpl extends AbstractSpringService<EntrepreneurDao, Entrepreneur> implements EntrepreneurService {
}
