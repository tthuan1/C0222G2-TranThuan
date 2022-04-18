package service.impl;


import controller.MainController;
import model.XeOto;
import service.IQuanLy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyOto implements IQuanLy {
    Scanner scanner=new Scanner(System.in);
    static ArrayList<XeOto> danhSachOto = new ArrayList<>();
    static {
        danhSachOto.add(new XeOto("81A1-33333","mada",2020,"thuan",4,"gia đình"));
        danhSachOto.add(new XeOto("92A1-33333", "met", 2019, "Huyen", 6,"du lịch"));
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
        System.out.print("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        danhSachOto.add(new XeOto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe));
    }

    @Override
    public void display() {
        for (int i = 0; i < danhSachOto.size() ; i++) {
            System.out.println(danhSachOto.get(i));
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (bienKiemSoat.equals(danhSachOto.get(i).getBienKiemSoat())) {
                System.out.println("Bạn có muốn xoá không:\ny\tn");
                String confirm=scanner.nextLine();
                if (confirm.equals("y")){
                    danhSachOto.remove(i);
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
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (bienKiemSoat.equals(danhSachOto.get(i).getBienKiemSoat())) {
                System.out.println(danhSachOto.get(i));
            }
        }
    }
}
