package by.artezio.trainingportal.utils.interceptors;

import by.artezio.trainingportal.model.Customer;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by user on 02.06.2015.
 */
@Component
public class MyOwnInterceptor extends EmptyInterceptor {
    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        if (entity instanceof Customer) {
            for (int i = 0; i < state.length; i++) {
                if ("createDate".equals(propertyNames[i])) {
                    state[i] = new Date();
                    System.out.println("Setting create date");
                    return true;
                }
            }
        }
        return super.onSave(entity, id, state, propertyNames, types);
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        if (entity instanceof Customer) {
            for (int i = 0; i < currentState.length; i++) {
                if ("updateDate".equals(propertyNames[i])) {
                    currentState[i] = new Date();
                    System.out.println("Setting new update date");
                    return true;
                }
            }
        }
        return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
    }
}
