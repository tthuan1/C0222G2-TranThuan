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

    public Villa(String tenDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang, Integer dienTichHoBoi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
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
        return "Villa- " +super.toString()+
                "Diện tích hồ bơi: " + dienTichHoBoi ;
    }
}
