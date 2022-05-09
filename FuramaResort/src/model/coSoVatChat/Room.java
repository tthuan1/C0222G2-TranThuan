package model.coSoVatChat;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
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
    public String toString() {
//        return "Room " +
//                ", mã dịch vụ: " + getServiceCode() +
//                ", tên dịch vụ: " + getServiceName() +
//                ", diện tích sử dụng: " + getUsableArea() +
//                ", chi phí thuê: " + getRentalCosts() +
//                ", số lượng người tối đa: " + getNumberOfPeople() +
//                ", kiểu thuê: " + getRentalType() +
//                ", dịch vụ miễn phí đi kèm: '" + freeService;
        return getServiceCode() +
                "," + getServiceName() +
                "," + getUsableArea() +
                "," + getRentalCosts() +
                "," + getNumberOfPeople() +
                "," + getRentalType() +
                "," + freeService;
    }
}
