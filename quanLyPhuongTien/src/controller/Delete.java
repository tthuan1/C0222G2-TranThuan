package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Delete {
    public static void delete(){
        Scanner scanner=new Scanner(System.in);
        QuanLyOto quanLyOto=new QuanLyOto();
        QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
        QuanLyXeTai quanLyXeTai=new QuanLyXeTai();

        System.out.println("Nhập biển kiểm soát muốn xoá");
        String choose=scanner.nextLine();
        quanLyOto.delete(choose);
        quanLyXeMay.delete(choose);
        quanLyXeTai.delete(choose);
    }
}
