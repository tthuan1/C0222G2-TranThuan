package model.coSoVatChat;

public abstract class Facility {
    private String tenDichVu;
    private String dienTichSuDung;
    private Double chiPhiThue;
    private Integer soLuongNguoiToiDa;
    private String KieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue) {
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

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
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

    @Override
    public String toString() {
        return "Facility- " +
                "Tên dịch vụ: " + tenDichVu +
                ", diện tích sử dụng: " + dienTichSuDung +
                ", chi phí thuê: " + chiPhiThue +
                ", số lượng người tối đa: " + soLuongNguoiToiDa +
                ", kiểu thuê: " + KieuThue ;
    }
}
