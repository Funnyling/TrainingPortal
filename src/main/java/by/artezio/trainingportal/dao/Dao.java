package by.artezio.trainingportal.dao;

import by.artezio.trainingportal.model.BaseEntity;

import java.util.List;

/**
 * Created by user on 06.03.2015.
 */
public interface Dao<T extends BaseEntity> {

    void saveOrUpdate(T entity);

    void delete(T entity);

    List<T> getAll();
}
