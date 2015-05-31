package by.artezio.trainingportal.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by user on 31.05.2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "organization")
public class Organization extends Customer {

    private String organizationName;

    @Column(name = "organization_name", nullable = true)
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organization)) return false;
        if (!super.equals(o)) return false;
        Organization that = (Organization) o;
        return Objects.equals(organizationName, that.organizationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), organizationName);
    }
}
