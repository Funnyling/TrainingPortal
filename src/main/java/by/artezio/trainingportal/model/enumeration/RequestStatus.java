package by.artezio.trainingportal.model.enumeration;

/**
 * Created by user on 06.03.2015.
 */
public enum RequestStatus {
    WAITING("В очереди"), APPROVED("Подтверждено"), CANCELLED("Отклонено");

    private String statusTitle;

    private RequestStatus(String statusTitle) {
        this.statusTitle = statusTitle;
    }
}
