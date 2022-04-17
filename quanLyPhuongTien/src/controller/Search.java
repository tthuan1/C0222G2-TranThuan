package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Search {
    public static void search(){
        QuanLyOto quanLyOto=new QuanLyOto();
        QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
        QuanLyXeTai quanLyXeTai=new QuanLyXeTai();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập biển số xe cần kiếm");
        String bienKiemSoat=scanner.nextLine();
        quanLyOto.search(bienKiemSoat);
        quanLyXeMay.search(bienKiemSoat);
        quanLyXeTai.search(bienKiemSoat);

    }
}
