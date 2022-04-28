package model.coSoVatChat;

public class Villa extends House{
    private Integer dienTichHoBoi;

    public Villa() {
    }

    public Villa(Integer dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String tieuChuanPhong, Integer soTang, Integer dienTichHoBoi) {
        super(tieuChuanPhong, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String maDichVu, String tenDichVu, Double dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang, Integer dienTichHoBoi) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Integer getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Integer dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa " +
                ", mã dịch vụ: " + getMaDichVu()+
                ", tên dịch vụ: " + getTenDichVu() +
                ", diện tích sử dụng: " + getDienTichSuDung() +
                ", chi phí thuê: " + getChiPhiThue() +
                ", số lượng người tối đa: " + getSoLuongNguoiToiDa() +
                ", kiểu thuê: " + getKieuThue()+
                ", tiêu chuẩn phòng: " + getTieuChuanPhong() +
                ", số tầng: " + getSoTang()+
                ", diện tích hồ bơi: " + dienTichHoBoi ;
    }
}
