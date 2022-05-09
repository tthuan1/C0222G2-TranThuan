package model.function;

import java.util.Date;

public class Booking {
// mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking() {
    }

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public String convertLine() {
        return this.maBooking + "," + this.ngayBatDau + "," + this.ngayKetThuc + "," + this.maKhachHang + "," + this.tenDichVu + "," + this.loaiDichVu;
    }
    @Override
    public String toString() {
        return "Booking- " +
                " mã booking: " + maBooking +
                ", ngày bắt đầu: " + ngayBatDau +
                ", ngày kết thúc: " + ngayKetThuc +
                ", mã khách hàng: " + maKhachHang +
                ", tên dịch vụ: " + tenDichVu +
                ", loại dịch vụ: " + loaiDichVu;
    }
}
