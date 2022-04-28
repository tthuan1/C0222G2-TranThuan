package model.coSoVatChat;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String maDichVu, String tenDichVu, Double dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String dichVuMienPhi) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room: " +
                ", mã dịch vụ: " + getMaDichVu() +
                ", tên dịch vụ: " + getTenDichVu() +
                ", diện tích sử dụng: " + getDienTichSuDung() +
                ", chi phí thuê: " + getChiPhiThue() +
                ", số lượng người tối đa: " + getSoLuongNguoiToiDa() +
                ", kiểu thuê: " + getKieuThue() +
                ", dịch vụ miễn phí đi kèm: '" + dichVuMienPhi;
    }
}
