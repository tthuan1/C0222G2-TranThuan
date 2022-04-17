package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Add {
    public static void addPhuongTien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô,\n" +
                "3. Thêm xe máy.");
        int choose=Integer.parseInt(scanner.nextLine());
        if (choose==1){
            QuanLyXeTai quanLyXeTai=new QuanLyXeTai();
            quanLyXeTai.add();
        }else if (choose==2){
            QuanLyOto quanLyOto=new QuanLyOto();
            quanLyOto.add();
        }else if (choose==3){
            QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
            quanLyXeMay.add();
        }else {
            addPhuongTien();
        }
    }
}
