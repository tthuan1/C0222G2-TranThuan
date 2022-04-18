package controller;

import java.util.Scanner;

public class MainController {
    public static void  displayMainMenu(){
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
            do {
                System.out.print("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                        "Chọn chức năng\n" +
                        "1. Thêm mới phương tiện\n" +
                        "2. Hiển thị phương tiện\n" +
                        "3. Xoá phương tiện\n" +
                        "4. Tìm kiếm theo biển kiểm soát\n" +
                        "5. Thoát\n");
                int chooseMenu = Integer.parseInt(scanner.nextLine());
                switch (chooseMenu){
                    case 1:
                        Add.addPhuongTien();
                        break;
                    case 2:
                        Display.displayPhuongTien();
                        break;
                    case 3:
                        Delete.delete();
                        break;
                    case 4:
                        Search.search();
                        break;
                    case 5:
                        System.out.println("Chương trình đã tắt");
                        flag=false;
                }
            }while (flag);
    }
}
