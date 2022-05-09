package model.people;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }


    public Customer(String customerCode, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String customerType, String address) {
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
    public String convertLine() {
        return this.customerCode + "," + super.convertLine() + "," + this.customerType + "," + this.address;
    }

    @Override
    public String toString() {
        return "Customer- " +
                "customerCode: " + customerCode +
                super.toString()+
                ", customerType: " + customerType +
                ", address: " + address ;
    }
}
