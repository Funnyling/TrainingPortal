package by.artezio.trainingportal.model;

import by.artezio.trainingportal.model.enumeration.CourseStatus;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by user on 04.03.2015.
 */
public class Course extends BaseEntity {

    private Long courseId;
    private String name;
    private String description;
    private String requirements;
    private CourseStatus status;
    private Integer maxNumberStudents;
    private BigDecimal price;
    private Calendar startDate;
    private Calendar endDate;

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

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
}
