package model.employee;

import java.util.Date;

public class Customer extends Person{
//Mã khách hàng,   Loại khách, Địa chỉ
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maKhachHang, String loaiKhach, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String name, Date ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(name, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer- " +
                "Mã khách hàng: " + maKhachHang +
                ", loại khách: " + loaiKhach +
                ", địa chỉ='" + diaChi;
    }
}
