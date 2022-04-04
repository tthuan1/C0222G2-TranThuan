package ss3_mang.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.print("\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n0. Exit\nNhập sự lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Nhập nhiệt độ Fahrenheit: ");
                    fahrenheit=scanner.nextDouble();
                    celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.print(fahrenheit+" fahrenheit = "+celsius+" celsius");
                    break;
                }
                case 2:{
                    System.out.print("Nhập nhiệt độ Celsius: ");
                    celsius=scanner.nextDouble();
                    fahrenheit = (9.0 / 5) * celsius + 32;
                    System.out.print(celsius+" fahrenheit = "+fahrenheit+" celsius");
                    break;
                }
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);
    }
}
