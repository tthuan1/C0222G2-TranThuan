package controller;

import java.util.Scanner;

public class MainController {
    public static void  displayMainMenu(){
        Scanner scanner=new Scanner(System.in);

            System.out.printf("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng\n" +
                    "1. Thêm mới phương tiện\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xoá phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            int chooseMenu = Integer.parseInt(scanner.nextLine());

    }
}
