package view;

import controller.MainController;
import service.impl.QuanLyXeMay;

public class View {
    public static void main(String[] args) {
        QuanLyXeMay quanLyXeMay=new QuanLyXeMay();
        quanLyXeMay.display();
        quanLyXeMay.add();
        quanLyXeMay.display();
    }
}
