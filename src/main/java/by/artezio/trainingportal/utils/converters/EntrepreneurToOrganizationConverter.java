package by.artezio.trainingportal.utils.converters;

import by.artezio.trainingportal.model.Entrepreneur;
import by.artezio.trainingportal.model.Organization;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by user on 07.06.2015.
 */
@Component
public class EntrepreneurToOrganizationConverter implements Converter<Entrepreneur, Organization> {
    @Override
    public Organization convert(Entrepreneur source) {
        return new Organization();
    }
}
