package controller;

import service.impl.QuanLyOto;
import service.impl.QuanLyXeMay;
import service.impl.QuanLyXeTai;

import java.util.Scanner;

public class Display {
    public static void displayPhuongTien(){
        Scanner scanner=new Scanner(System.in);
        QuanLyXeTai quanLyXeTai=new QuanLyXeTai();
        QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
        QuanLyOto quanLyOto=new QuanLyOto();
        System.out.println("\n1. Hiện thị xe tải." +
                "\n2. Hiển thị oto" +
                "\n3. Hiển thị xe máy" +
                "\n4.Hiển thị tất cả");
        int choose=Integer.parseInt(scanner.nextLine());
        if (choose==1){
            quanLyXeTai.display();
        }else if (choose==2){
            quanLyOto.display();
        }else if (choose==3){
            quanLyXeMay.display();
        }else if (choose==4){
            quanLyXeTai.display();
            quanLyOto.display();
            quanLyXeMay.display();

        }
    }
}
