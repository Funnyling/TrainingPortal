package by.artezio.trainingportal.model;

import by.artezio.trainingportal.model.enumeration.UserRole;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 04.03.2015.
 */
@Entity
@Table(schema = "TRAINING_PORTAL", name = "USERS")
public class User extends BaseEntity {

    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "lecturer")
    private List<Course> readCourses;

    @ManyToMany(mappedBy = "students")
    private Set<Course> selectedCourses;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Set<Course> getSelectedCourses() {
        return selectedCourses;
    }

    public void setSelectedCourses(Set<Course> selectedCourses) {
        this.selectedCourses = selectedCourses;
    }

    public List<Course> getReadCourses() {
        return readCourses;
    }

    public void setReadCourses(List<Course> readCourses) {
        this.readCourses = readCourses;
    }
}
