package model;

import java.util.Date;

public class Contract extends Booking{
    //Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
    private String soHopDong;
    Integer soTienCoc;
    Integer tongTienThanhToan;

    public Contract() {
    }

    public Contract(String soHopDong, Integer soTienCoc, Integer tongTienThanhToan,String maBooking) {
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public Contract(String maBooking, Date ngayBatDau, Date ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu, String soHopDong, Integer soTienCoc, Integer tongTienThanhToan) {
    super(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "số hợp đồng: " + soHopDong +
                ", số tiền cọc: " + soTienCoc +
                ", tổng tiền thanh toán: =" + tongTienThanhToan ;
    }
}
