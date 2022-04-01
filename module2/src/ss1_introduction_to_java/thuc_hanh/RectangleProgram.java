package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Diện tích hình chữ nhật là: "+area);

    }
}

