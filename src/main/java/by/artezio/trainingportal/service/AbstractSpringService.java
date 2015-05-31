package by.artezio.trainingportal.service;

import by.artezio.trainingportal.dao.Dao;
import by.artezio.trainingportal.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 06.03.2015.
 */
abstract public class AbstractSpringService<T extends Dao, E extends BaseEntity> implements Service<E> {

    private T dao;

    protected T getDao() {
        return dao;
    }

    @Autowired
    protected void setDao(T dao) {
        this.dao = dao;
    }

    public E save(E entity) {
        dao.saveOrUpdate(entity);
        return entity;
    }

    public void delete(E entity){
        dao.delete(entity);
    }


    public List<E> getAll() {
        return dao.getAll();
    }
}
