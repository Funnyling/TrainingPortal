package by.artezio.trainingportal.utils.converters;

import by.artezio.trainingportal.model.Entrepreneur;
import by.artezio.trainingportal.model.Organization;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * Created by user on 07.06.2015.
 */
final public class EntrepreneurToOrganizationConverterFactory implements ConverterFactory<Entrepreneur, Organization> {

    @Override
    public <T extends Organization> Converter<Entrepreneur, T> getConverter(Class<T> targetType) {
        return new EntrepreneurToOrganizationConverter(targetType);
    }

    private final class EntrepreneurToOrganizationConverter<T extends Organization> implements Converter<Entrepreneur, Organization> {

        private Class<T> organizationClass;
        private EntrepreneurToOrganizationConverter(Class<T> organizationClass) {
            this.organizationClass = organizationClass;
        }

        @Override
        public T convert(Entrepreneur source) {
            return (T)(new Organization());
        }
    }
}

