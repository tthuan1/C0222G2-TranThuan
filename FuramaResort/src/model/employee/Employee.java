package model.employee;


public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private Integer salary;

    public Employee() {
    }

//    public Employee(String maNhanVien, String trinhDo, String viTri, Integer luong) {
//        this.maNhanVien = maNhanVien;
//        this.trinhDo = trinhDo;
//        this.viTri = viTri;
//        this.luong = luong;
//    }

    public Employee(String employeeCode,String name,String dateOfBirth,String gender,String identityCard,String phoneNumber,String email,String level,String position,Integer salary) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
//        name,ngaySinh,gioiTinh,cmnd,sdt,email,maNhanVien,trinhDo,viTri, luong
//        return "Employee "  +
//                ", mã nhân viên: " + employeeCode +
//                ", tên nhân viên: " + getName() +
//                ", ngày sinh: " + getDateOfBirth() +
//                ", giới tính: " + getGender() +
//                ", cmnd: " + getIdentityCard() +
//                ", sdt: " + getPhoneNumber() +
//                ", email: " + getEmail()+
//                ", trình độ: " + level +
//                ", vị trí: " + position +
//                ", lương: " + salary;
        return   employeeCode +
                "," + getName() +
                "," + getDateOfBirth() +
                "," + getGender() +
                "," + getIdentityCard() +
                "," + getPhoneNumber() +
                "," + getEmail()+
                "," + level +
                "," + position +
                "," + salary;
    }
}
