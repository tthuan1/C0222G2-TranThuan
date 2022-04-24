package ss15_xu_li_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhập a: ");
        int a=Integer.parseInt(scanner.nextLine());
        System.out.print("nhập b: ");
        int b=Integer.parseInt(scanner.nextLine());
        System.out.print("nhập c: ");
        int c=Integer.parseInt(scanner.nextLine());
        try {
            triangle(a,b,c);
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void triangle(int a,int b,int c) throws TriangleException{
            if (a+b>c||a+c>b||b+c>a){
                throw new TriangleException("Không phải là tam giác");
            } else if (a<=0||b<=0||c<=0) {
                throw new TriangleException("Số nhập có cạnh bé hơn hoặc bằng 0");
            }else {
                System.out.println("Là tam giác");
            }





    }

}
