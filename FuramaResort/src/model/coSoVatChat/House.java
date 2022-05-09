package model.coSoVatChat;

public class House extends Facility {
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }

    public House(String roomStandard, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
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
    public String toString() {
//        return "House " +
//                ", mã dịch vụ: " + getServiceCode() +
//                ", tên dịch vụ: " + getServiceName() +
//                ", diện tích sử dụng: " + getUsableArea() +
//                ", chi phí thuê: " + getRentalCosts() +
//                ", số lượng người tối đa: " + getNumberOfPeople() +
//                ", kiểu thuê: " + getRentalType() +
//                ", tiêu chuẩn phòng: " + roomStandard +
//                ", số tầng: " + numberOfFloors;
        return getServiceCode() +
                "," + getServiceName() +
                "," + getUsableArea() +
                "," + getRentalCosts() +
                "," + getNumberOfPeople() +
                "," + getRentalType() +
                "," + roomStandard +
                "," + numberOfFloors;
    }
}
