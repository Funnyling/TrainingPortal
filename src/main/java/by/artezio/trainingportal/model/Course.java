package by.artezio.trainingportal.model;

import by.artezio.trainingportal.model.enumeration.CourseStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Created by user on 04.03.2015.
 */
@Entity
@Table(schema = "TRAINING_PORTAL", name = "COURSES")
public class Course extends BaseEntity {

    @Id
    @Column(name = "COURSE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "REQUIREMENTS")
    private String requirements;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private CourseStatus status;

    @Column(name = "MAX_NUMBER_STUDENTS")
    private Integer maxNumberStudents;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "LECTURER_ID", referencedColumnName = "USER_ID")
    private User lecturer;

    @ManyToMany
    @JoinTable(schema = "TRAINING_PORTAL", name="COURSES_USERS", joinColumns={@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="USER_ID")})
    private Set<User> students;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public CourseStatus getStatus() {
        return status;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }

    public Integer getMaxNumberStudents() {
        return maxNumberStudents;
    }

    public void setMaxNumberStudents(Integer maxNumberStudents) {
        this.maxNumberStudents = maxNumberStudents;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public User getLecturer() {
        return lecturer;
    }

    public void setLecturer(User lecturer) {
        this.lecturer = lecturer;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }
}
