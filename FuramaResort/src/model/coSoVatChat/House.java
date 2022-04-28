package model.coSoVatChat;

public class House extends Facility {
    private String tieuChuanPhong;
    private Integer soTang;

    public House() {
    }

    public House(String tieuChuanPhong, Integer soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String maDichVu, String tenDichVu, Double dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " +
                ", mã dịch vụ: " + getMaDichVu() +
                ", tên dịch vụ: " + getTenDichVu() +
                ", diện tích sử dụng: " + getDienTichSuDung() +
                ", chi phí thuê: " + getChiPhiThue() +
                ", số lượng người tối đa: " + getSoLuongNguoiToiDa() +
                ", kiểu thuê: " + getKieuThue() +
                ", tiêu chuẩn phòng: " + tieuChuanPhong +
                ", số tầng: " + soTang;
    }
}
