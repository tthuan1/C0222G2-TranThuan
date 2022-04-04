package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập USD: ");
        int usd=Integer.parseInt(sc.nextLine());
        System.out.print("Giá trị vnd là: "+ usd*24000+" vnd");

    }
}

