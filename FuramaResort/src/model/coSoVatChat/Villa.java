package model.coSoVatChat;

public class Villa extends House{
    private Double dienTichHoBoi;

    public Villa() {
    }

    public Villa(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String tieuChuanPhong, Integer soTang, Double dienTichHoBoi) {
        super(tieuChuanPhong, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String tenDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang, Double dienTichHoBoi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa- " +
                "Diện tích hồ bơi: " + dienTichHoBoi ;
    }
}
