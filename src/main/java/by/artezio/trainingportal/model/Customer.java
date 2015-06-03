package by.artezio.trainingportal.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Created by user on 31.05.2015.
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "customer_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "customer", schema = "jpa_hibernate_schema")
public abstract class Customer extends BaseEntity {

    private String guid;

    private String innNumber;

    private String kppNumber;

    private Date registrationDate;

    private Date createDate;

    private Date updateDate;

    private String customerType;

    @Id
    @Column(name = "guid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CustomUUIDGenerator")
    @GenericGenerator(name = "CustomUUIDGenerator", strategy = "by.artezio.trainingportal.utils.CustomUUIDGenerator")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Column(name = "inn_number", unique = true, nullable = false)
    public String getInnNumber() {
        return innNumber;
    }

    public void setInnNumber(String innNumber) {
        this.innNumber = innNumber;
    }

    @Column(name = "kpp_number", unique = true, nullable = false)
    public String getKppNumber() {
        return kppNumber;
    }

    public void setKppNumber(String kppNumber) {
        this.kppNumber = kppNumber;
    }

    @Column(name = "registration_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Column(name = "create_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(guid, customer.guid) &&
                Objects.equals(innNumber, customer.innNumber) &&
                Objects.equals(kppNumber, customer.kppNumber) &&
                Objects.equals(registrationDate, customer.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, innNumber, kppNumber, registrationDate);
    }
}
