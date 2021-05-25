package com.devx.DTO;

import java.util.List;

/**
 * @author Subash
 * @since 5/26/2021
 */
public class Session {
    private String date;
    private int availableCapacity;
    private int minAgeLimit;
    private String vaccine;
    private List<String> slots;
    private int availableCapacityDose1;
    private int availableCapacityDose2;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public int getMinAgeLimit() {
        return minAgeLimit;
    }

    public void setMinAgeLimit(int minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    public int getAvailableCapacityDose1() {
        return availableCapacityDose1;
    }

    public void setAvailableCapacityDose1(int availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
    }

    public int getAvailableCapacityDose2() {
        return availableCapacityDose2;
    }

    public void setAvailableCapacityDose2(int availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
    }

    @Override
    public String toString() {
        return "Session{" + "date='" + date + '\'' + ", availableCapacity=" + availableCapacity + ", minAgeLimit=" + minAgeLimit
                + ", vaccine='" + vaccine + '\'' + ", slots=" + slots + ", availableCapacityDose1=" + availableCapacityDose1
                + ", availableCapacityDose2=" + availableCapacityDose2 + '}';
    }
}
