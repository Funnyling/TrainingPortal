package by.artezio.trainingportal.model.enumeration;

/**
 * Created by user on 05.03.2015.
 */
public enum CourseStatus {

    ACTIVE("Идет набор"), STARTED("Начался"), ENDED("Закончился");

    private String title;

    private CourseStatus (String title) {
        this.title = title;
    }
}
