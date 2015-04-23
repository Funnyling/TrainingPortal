package by.artezio.trainingportal.utils;

import java.io.Serializable;

/**
 * Created by user on 23.04.2015.
 */
public class SearchParams implements Serializable {
    private String userGuid;
    private String operator;
    private String period;

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchParams{");
        sb.append("userGuid='").append(userGuid).append('\'');
        sb.append(", operator='").append(operator).append('\'');
        sb.append(", period='").append(period).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
