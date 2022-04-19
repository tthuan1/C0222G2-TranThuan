package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Display {
    public static void displayPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        QuanLyXeTai quanLyXeTai = new QuanLyXeTai();
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        QuanLyOto quanLyOto = new QuanLyOto();
        System.out.println("\n1. Hiện thị xe tải." +
                "\n2. Hiển thị oto" +
                "\n3. Hiển thị xe máy" +
                "\n4.Hiển thị tất cả");
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose) {
            case 1:
                quanLyXeTai.display();
                break;
            case 2:
                quanLyOto.display();
break;
            case 3:
                quanLyXeMay.display();
break;
            case 4:
                quanLyXeTai.display();
                quanLyOto.display();
                quanLyXeMay.display();
                break;
            default:
                System.out.println("Bạn nhập không đúng cú pháp!!");
                displayPhuongTien();
        }
    }
}
