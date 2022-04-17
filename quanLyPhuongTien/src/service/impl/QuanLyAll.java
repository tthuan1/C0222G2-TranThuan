package service.impl;

import model.PhuongTien;

import java.util.ArrayList;

public class QuanLyAll implements IQuanLy{
    static ArrayList<PhuongTien> danhSachAll = new ArrayList<>();

    @Override
    public void add() {
//        for (int i = 0; i < QuanLyXeMay.danhSachXeMay.size(); i++) {
//            danhSachAll.add(QuanLyXeMay.danhSachXeMay.get(i));
//        }
//        for (int i = 0; i < QuanLyXeTai.danhSachXeTai.size(); i++) {
//            danhSachAll.add(QuanLyXeTai.danhSachXeTai.get(i));
//        }
//        for (int i = 0; i < QuanLyOto.danhSachOto.size(); i++) {
//            danhSachAll.add(QuanLyOto.danhSachOto.get(i));
//        }
        danhSachAll.addAll(QuanLyXeMay.danhSachXeMay);
        danhSachAll.addAll(QuanLyXeTai.danhSachXeTai);
        danhSachAll.addAll(QuanLyOto.danhSachOto);
    }

    @Override
    public void display() {
        for (int i = 0; i < danhSachAll.size(); i++) {
            System.out.println(danhSachAll.get(i));
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachAll.size(); i++) {
            if (bienKiemSoat.equals(danhSachAll.get(i).getBienKiemSoat())) {
                danhSachAll.remove(i);
                System.out.println("Đã xoá thành công");
                break;
            }
        }
    }

    @Override
    public void search(String bienKiemSoat) {

    }

}
