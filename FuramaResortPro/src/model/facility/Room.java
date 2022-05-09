package model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, Integer numberOfPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String convertLine() {
        return super.convertLine() + "," + freeService;
    }

    @Override
    public String toString() {
        return "Room- " +
                super.toString() +
                ", freeService: " + freeService;
    }
}
