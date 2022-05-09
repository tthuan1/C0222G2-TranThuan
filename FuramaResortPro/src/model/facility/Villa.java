package model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private Integer numberOfFloors;
    private Integer poolAcreage;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, Integer numberOfPeople, String rentalType, String roomStandard, Integer numberOfFloors, Integer poolAcreage) {
        super(serviceCode, serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
        this.poolAcreage = poolAcreage;
    }

    @Override
    public String convertLine() {
        return super.convertLine() + "," + roomStandard + "," + numberOfFloors + "," + poolAcreage;
    }

    @Override
    public String toString() {
        return "Villa- " +
                super.toString() +
                ", roomStandard: " + roomStandard + '\'' +
                ", numberOfFloors: " + numberOfFloors +
                ", poolAcreage: " + poolAcreage;
    }
}
