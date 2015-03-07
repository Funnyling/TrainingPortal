package by.artezio.trainingportal.service;

import by.artezio.trainingportal.model.BaseEntity;

import java.util.List;

/**
 * Created by user on 06.03.2015.
 */
public interface Service<T extends BaseEntity> {

    T save(T entity);

    void delete(T entity);

    List<T> getAll();
}
