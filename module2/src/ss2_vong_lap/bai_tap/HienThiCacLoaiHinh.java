package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice=-1;
        String str = "";
        Scanner scanner=new Scanner(System.in);
        while (choice!=4){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                break;
                case 2:
                    System.out.println("2. Print the square triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 4; i > 0; i--) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    int n=5;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n*2; j++) {
                            if (j <= (n - i)) {
                                System.out.print("   ");
                            } else if (j>=(n+i)){
                                System.out.print("   ");
                            }else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println("");
                    }
                break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
