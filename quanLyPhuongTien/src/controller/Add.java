package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Add {
    public static void addPhuongTien(){
        QuanLyXeTai quanLyXeTai=new QuanLyXeTai();
        QuanLyOto quanLyOto=new QuanLyOto();
        QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô,\n" +
                "3. Thêm xe máy.");
        int choose=Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                quanLyXeTai.add();
                break;
            case 2:
                quanLyOto.add();
                break;
            case 3:
                quanLyXeMay.add();
                break;
            default:
                addPhuongTien();
        }
    }
}
