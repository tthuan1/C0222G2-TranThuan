package model.coSoVatChat;

public abstract class Facility {
    private String maDichVu;
    private String tenDichVu;
    private Double dienTichSuDung;
    private Double chiPhiThue;
    private Integer soLuongNguoiToiDa;
    private String KieuThue;

    public Facility() {
    }

    public Facility(String maDichVu, String tenDichVu, Double dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        KieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(Double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(Integer soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return KieuThue;
    }

    public void setKieuThue(String kieuThue) {
        KieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "Facility: " +
                ", mã dịch vụ: " + maDichVu +
                ", tên dịch vụ: " + tenDichVu +
                ", diện tích sử dụng: " + dienTichSuDung +
                ", chi phí thuê: " + chiPhiThue +
                ", số lượng người tối đa: " + soLuongNguoiToiDa +
                ", kiểu thuê: " + KieuThue;
    }
}
