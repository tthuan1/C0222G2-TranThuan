package service.impl;

import controller.MainController;
import model.XeMay;
import service.IQuanLy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeMay implements IQuanLy {
    static ArrayList<XeMay> danhSachXeMay = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        danhSachXeMay.add(new XeMay("47B1-22222", "honda", 2015, "Tran Thuan", "50cc"));
        danhSachXeMay.add(new XeMay("43B1-22222", "SH", 2020, "Nam", "150cc"));
        danhSachXeMay.add(new XeMay("92B1-22222", "AB", 2019, "Huyen", "125cc"));
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
            System.out.println(danhSachXeMay.get(i));
        }
    }



    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (bienKiemSoat.equals(danhSachXeMay.get(i).getBienKiemSoat())) {
                System.out.println("Bạn có muốn xoá không:\ny\tn");
                String confirm=scanner.nextLine();
                if (confirm.equals("y")){
                    danhSachXeMay.remove(i);
                    System.out.println("Đã xoá thành công");
                    break;
                }else if (confirm.equals("n")){
                    System.out.println("Không xoá thành công");
                    MainController.displayMainMenu();
                }else {
                    System.out.println("bạn nhập sai rồi");
                    MainController.displayMainMenu();
                }
            }
        }
    }

    @Override
    public void search(String bienKiemSoat) {
//        String[] str=bienKiemSoat.split("");
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (bienKiemSoat.equals(danhSachXeMay.get(i).getBienKiemSoat())) {
                System.out.println(danhSachXeMay.get(i));
            }
        }
    }


}
