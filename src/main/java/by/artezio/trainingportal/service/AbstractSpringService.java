package by.artezio.trainingportal.service;

import by.artezio.trainingportal.dao.Dao;
import by.artezio.trainingportal.model.BaseEntity;

/**
 * Created by user on 06.03.2015.
 */
abstract public class AbstractSpringService<E extends Dao, T extends BaseEntity> implements Service<T>  {
}
