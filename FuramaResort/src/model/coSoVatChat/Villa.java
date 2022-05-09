package model.coSoVatChat;

public class Villa extends House {
    private Integer poolAcreage;

    public Villa() {
    }

    public Villa(Integer poolAcreage) {
        this.poolAcreage = poolAcreage;
    }

    public Villa(String tieuChuanPhong, Integer soTang, Integer poolAcreage) {
        super(tieuChuanPhong, soTang);
        this.poolAcreage = poolAcreage;
    }

    public Villa(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, Integer numberOfPeople, String rentalType, String roomStandard, Integer numberOfFloors, Integer poolAcreage) {
        super(serviceCode, serviceName, usableArea, rentalCosts, numberOfPeople, rentalType, roomStandard, numberOfFloors);
        this.poolAcreage = poolAcreage;
    }

    public Integer getPoolAcreage() {
        return poolAcreage;
    }

    public void setPoolAcreage(Integer poolAcreage) {
        this.poolAcreage = poolAcreage;
    }

    @Override
    public String toString() {
//        return "Villa " +
//                ", mã dịch vụ: " + getServiceCode() +
//                ", tên dịch vụ: " + getServiceName() +
//                ", diện tích sử dụng: " + getUsableArea() +
//                ", chi phí thuê: " + getRentalCosts() +
//                ", số lượng người tối đa: " + getNumberOfPeople() +
//                ", kiểu thuê: " + getRentalType() +
//                ", tiêu chuẩn phòng: " + getRoomStandard() +
//                ", số tầng: " + getNumberOfFloors() +
//                ", diện tích hồ bơi: " + poolAcreage;
        return getServiceCode() +
                "," + getServiceName() +
                "," + getUsableArea() +
                "," + getRentalCosts() +
                "," + getNumberOfPeople() +
                "," + getRentalType() +
                "," + getRoomStandard() +
                "," + getNumberOfFloors() +
                "," + poolAcreage;
    }
}
