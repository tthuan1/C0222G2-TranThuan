package service.impl;

import controller.MainController;
import model.XeTai;
import service.IQuanLy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeTai implements IQuanLy {

    Scanner scanner=new Scanner(System.in);
    static ArrayList<XeTai> danhSachXeTai = new ArrayList<>();
    static {
        danhSachXeTai.add(new XeTai("43C1-11111", "met", 2020, "thuan1",100));
        danhSachXeTai.add(new XeTai("92C1-11111", "met", 2019, "thuan2", 1000));
        danhSachXeTai.add(new XeTai("74C1-11111", "met", 2018, "thuan3", 10000));
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
        int trongTai = Integer.parseInt(scanner.nextLine());
        danhSachXeTai.add(new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai));
    }

    @Override
    public void display() {
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            System.out.println(danhSachXeTai.get(i));
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            if (bienKiemSoat.equals(danhSachXeTai.get(i).getBienKiemSoat())) {
                System.out.println("Bạn có muốn xoá không:\ny\tn");
                String confirm=scanner.nextLine();
                if (confirm.equals("y")){
                    danhSachXeTai.remove(i);
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
        for (int i = 0; i < danhSachXeTai.size(); i++) {
            if (bienKiemSoat.equals(danhSachXeTai.get(i).getBienKiemSoat())) {
                System.out.println(danhSachXeTai.get(i));
            }
        }
    }
}
