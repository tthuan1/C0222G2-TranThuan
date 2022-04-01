package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tháng: ");
        int month = sc.nextInt();

        while (month < 1 || month > 12) {
            System.out.print("Nhập lại số tháng: ");
            month = sc.nextInt();
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + " có 30 ngày");
                break;
            case 2:
                System.out.print("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng " + month + " có 31 ngày");
                break;
            default:
                break;
        }
    }
}
