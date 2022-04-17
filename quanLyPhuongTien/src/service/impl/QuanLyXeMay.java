package service.impl;

import model.XeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeMay implements IQuanLy {
    static ArrayList<XeMay> danhSachXeMay = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        danhSachXeMay.add(new XeMay("47B1-00498", "honda", 2015, "Tran Thuan", "50cc"));
        danhSachXeMay.add(new XeMay("43H1-22222", "SH", 2020, "Nam", "150cc"));
        danhSachXeMay.add(new XeMay("92C1-33333", "AB", 2019, "Huyen", "125cc"));
    }

    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập Nhập tên hãng: ");
        String tenHangSanXuat = scanner.nextLine();
        System.out.print("Nhập Năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập công xuất: ");
        String congXuat = scanner.nextLine();
        danhSachXeMay.add(new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congXuat));
    }

    @Override
    public void display() {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            System.out.println(danhSachXeMay.get(i).getBienKiemSoat());
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (bienKiemSoat.equals(danhSachXeMay.get(i).getBienKiemSoat())) {
                danhSachXeMay.remove(i);
                System.out.println("Đã xoá thành công");
            }else {
                System.out.println("không thể xoá!!");
            }
        }

    }

    @Override
    public void search() {

    }


}
