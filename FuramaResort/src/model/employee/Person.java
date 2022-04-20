package model.employee;

import java.util.Date;

public abstract class Person {
    //   Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,
    private String name;
    private Date ngaySinh;
    private String gioiTinh;
    private String cmnd;
    private String sdt;
    private String email;

    public Person() {
    }

    public Person(String name, Date ngaySinh, String gioiTinh, String cmnd, String sdt, String email) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person- " +
                "name: " + name +
                ", ngày sinh: " + ngaySinh +
                ", giới tính: " + gioiTinh +
                ", cmnd: " + cmnd +
                ", sdt: " + sdt +
                ", email: " + email;
    }
}
