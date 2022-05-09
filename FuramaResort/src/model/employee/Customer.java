package model.employee;


public class Customer extends Person {
    //Mã khách hàng,   Loại khách, Địa chỉ
    private String customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String customerCode,String name,String dateOfBirth,String gender,String identityCard,String phoneNumber,String email,String customerType,String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return    customerCode +
                "," + getName() +
                "," + getDateOfBirth() +
                "," + getGender() +
                "," + getIdentityCard() +
                "," + getPhoneNumber() +
                "," + getEmail() +
                "," + customerType +
                "," + address;
//        return "Customer" +
//                ", tên: " + getName() +
//                ", ngày sinh: " + getDateOfBirth() +
//                ", giới tính: " + getGender() +
//                ", cmnd: " + getIdentityCard() +
//                ", sdt: " + getPhoneNumber() +
//                ", email: " + getEmail() +
//                ", mã khách hàng: " + customerCode +
//                ", loại khách: " + customerType +
//                ", địa chỉ: " + address;
    }
    public String getInformation(){
        return getName() +
                "," + getDateOfBirth() +
                "," + getGender() +
                "," + getIdentityCard() +
                "," + getPhoneNumber() +
                "," + getEmail() +
                "," + customerCode +
                "," + customerType +
                "," + address;
    }
}
