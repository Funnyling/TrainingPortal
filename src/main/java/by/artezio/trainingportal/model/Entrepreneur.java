package by.artezio.trainingportal.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by user on 31.05.2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "entrepreneur")
public class Entrepreneur extends Customer {

    private String firstname;
    
    private String surname;
    
    private String middlename;

    @Column(name = "firstname", nullable = true)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "surname", nullable = true)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "middlename", nullable = true)
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entrepreneur)) return false;
        if (!super.equals(o)) return false;
        Entrepreneur that = (Entrepreneur) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(middlename, that.middlename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstname, surname, middlename);
    }
}
