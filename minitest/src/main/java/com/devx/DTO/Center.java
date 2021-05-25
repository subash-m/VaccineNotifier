package com.devx.DTO;

import java.util.List;

/**
 * @author Subash
 * @since 5/26/2021
 */
public class Center {
    private String name;
    private String address;
    private String stateName;
    private String districtName;
    private String from;
    private String to;
    private String feeType;
    private List<Session> sessions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Center{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", stateName='" + stateName + '\'' + ", districtName='"
                + districtName + '\'' + ", from='" + from + '\'' + ", to='" + to + '\'' + ", feeType='" + feeType + '\'' + ", sessions="
                + sessions + '}';
    }
}
