package model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private Double usableArea;
    private Double rentalCosts;
    private Integer numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, Integer numberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode, serviceName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Facility facility = (Facility) obj;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    public String convertLine() {
        return this.serviceCode + "," + this.serviceName + "," + this.usableArea + "," + this.rentalCosts + "," + this.numberOfPeople + "," + this.rentalType;
    }

    @Override
    public String toString() {
        return "serviceCode: " + serviceCode +
                        ", serviceName: " + serviceName +
                        ", usableArea: " + usableArea +
                        ", rentalCosts: " + rentalCosts +
                        ", numberOfPeople: " + numberOfPeople +
                        ", rentalType: " + rentalType;
    }
}
