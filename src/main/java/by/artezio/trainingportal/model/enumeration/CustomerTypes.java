package by.artezio.trainingportal.model.enumeration;

/**
 * Created by user on 03.06.2015.
 */
public enum CustomerTypes {

    ORGANIZATON("ORGANIZATION"), ENTREPRENEUR("ENTREPRENEUR");

    public String type;

    CustomerTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
