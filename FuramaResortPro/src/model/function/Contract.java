package model.function;

import java.util.Date;

public class Contract extends Booking {
    //Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
    private Integer soHopDong;
    private Integer soTienCoc;
    private Integer tongTienThanhToan;

    public Contract() {
    }


    public Contract(String maBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu, Integer soHopDong, Integer soTienCoc, Integer tongTienThanhToan) {
        super(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    @Override
    public String convertLine() {
        return super.convertLine() + "," + this.soHopDong + "," + this.soTienCoc + "," + this.tongTienThanhToan;
    }

    @Override
    public String toString() {
        return "Contract: " +
                " mã booking: " + super.getMaBooking() +
                ", ngày bắt đầu: " + super.getNgayBatDau() +
                ", ngày kết thúc: " + super.getNgayKetThuc() +
                ", mã khách hàng: " + super.getMaKhachHang() +
                ", tên dịch vụ: " + super.getTenDichVu() +
                ", loại dịch vụ: " + super.getLoaiDichVu() +
                "số hợp đồng: " + soHopDong +
                ", số tiền cọc: " + soTienCoc +
                ", tổng tiền thanh toán: " + tongTienThanhToan;
    }
}
