package by.artezio.trainingportal.utils;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.SequenceGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by user on 03.06.2015.
 */
public class CustomUUIDGenerator extends SequenceGenerator {
    @Override
    public Serializable generate(SessionImplementor session, Object obj) {
        return UUID.randomUUID().toString();
    }
}
