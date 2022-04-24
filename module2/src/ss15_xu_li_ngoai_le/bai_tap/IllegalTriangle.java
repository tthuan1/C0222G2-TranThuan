package ss15_xu_li_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        triangle();


    }

    public static void triangle() {
        try {
            System.out.print("nhập a: ");
            int a=Integer.parseInt(scanner.nextLine());
            System.out.print("nhập b: ");
            int b=Integer.parseInt(scanner.nextLine());
            System.out.print("nhập c: ");
            int c=Integer.parseInt(scanner.nextLine());
            if (a+b>c||a+c>b||b+c>a){
                System.err.println("Là tam giác");
            }
        }catch (Exception e){
            System.out.println("không phải là tam giác");
            System.out.println(e.getMessage());
        }





    }

}
