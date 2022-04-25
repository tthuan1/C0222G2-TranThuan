package ss17_binary_file_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
//- Mã sản phẩm
//
//- Tên sản phẩm
//
//- Hãn sản xuất
//
//- Giá
//
//- Các mô tả khác
    private String maSanPham;
    private String tenSanPham;
    private String hanSanXuat;
    private int gia;
    private String moTaKhac;

    public Product() {
    }

    public Product(String maSanPham, String tenSanPham, String hanSanXuat, int gia, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hanSanXuat = hanSanXuat;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hanSanXuat='" + hanSanXuat + '\'' +
                ", gia=" + gia +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}
