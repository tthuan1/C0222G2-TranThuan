package model.employee;


public class Employee extends Person{
    //    Mã nhân viên, Trình độ, Vị trí, lương
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private Integer luong;

    public Employee() {
    }

//    public Employee(String maNhanVien, String trinhDo, String viTri, Integer luong) {
//        this.maNhanVien = maNhanVien;
//        this.trinhDo = trinhDo;
//        this.viTri = viTri;
//        this.luong = luong;
//    }

    public Employee(String name, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String maNhanVien, String trinhDo, String viTri, Integer luong) {
        super(name, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Integer getLuong() {
        return luong;
    }

    public void setLuong(Integer luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
//        name,ngaySinh,gioiTinh,cmnd,sdt,email,maNhanVien,trinhDo,viTri, luong
        return "Employee- "  +
                "  Mã nhân viên: " + maNhanVien  +
                ", tên nhân viên: " + getName() +
                ", ngày sinh: " + getNgaySinh() +
                ", giới tính: " + getGioiTinh() +
                ", cmnd: " + getCmnd() +
                ", sdt: " + getSdt() +
                ", email: " + getEmail()+
                ", trình độ: " + trinhDo +
                ", vị trí: " + viTri  +
                ", lương=" + luong ;
    }
}
