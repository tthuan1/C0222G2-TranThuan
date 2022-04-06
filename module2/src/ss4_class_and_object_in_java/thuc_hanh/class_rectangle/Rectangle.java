package ss4_class_and_object_in_java.thuc_hanh.class_rectangle;

import java.util.Scanner;

public class Rectangle {

    Scanner scanner = new Scanner(System.in);
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void input() {
        System.out.printf("Nhập chiều rộng: ");
        this.width = Double.parseDouble(scanner.nextLine());
        System.out.printf("Nhập chiều cao: ");
        this.height = Double.parseDouble(scanner.nextLine());
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void display() {
        System.out.print("Hình chữ nhật:" +
                "\nChiều rộng: "+this.width +
                "\nChiều cao: "+this.height+
                "\nDiện tích hình chữ nhật này là: "+this.getArea()+
                "\nChu vi hình chữ nhật này là: "+this.getPerimeter());
    }


}
