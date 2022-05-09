package model.facility;

public class House extends Facility {
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }


    public House(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, Integer numberOfPeople, String rentalType, String roomStandard, Integer numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String convertLine() {
        return super.convertLine() + "," + this.roomStandard + "," + this.numberOfFloors;
    }

    @Override
    public String toString() {
        return "House- " +
                super.toString() +
                ", roomStandard: " + roomStandard +
                ", numberOfFloors: " + numberOfFloors;
    }
}
