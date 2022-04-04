package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumbersToLetters {
    public static void main(String[] args) {
        String[] singleNumber = {"one", "two", "three", "four", "five", "six", "server", "eight", "nine"};
        String[] doubleNumber = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] firstDouble = {"twenty", "thirty", "forty", "fifty", "sixties", "seventies", "eighty", "ninety"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cố cần đọc");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 10 && number > 0) {
            System.out.println(singleNumber[number - 1]);
        } else if (number < 20) {
            System.out.print(doubleNumber[number - 10]);
        } else if (number < 100) {
            if (number - (number / 10) * 10 - 1 < 0) {
                System.out.print(firstDouble[number / 10 - 2]);
            } else {
                System.out.print(firstDouble[number / 10 - 2] + " " + singleNumber[number - (number / 10) * 10 - 1]);
            }
        } else if (number < 1000) {
            if ((number - (number / 100) * 100) / 10 - 2 < 0 && (number - (number / 100) * 100) - ((number - (number / 100) * 100) / 10) * 10 - 1 < 0) {
                System.out.print(singleNumber[number / 100 - 1] + " hundred ");
            } else if ((number - (number / 100) * 100) / 10 - 2 < 0) {
                System.out.print(singleNumber[number / 100 - 1] + " hundred and " + singleNumber[(number - (number / 100) * 100) - ((number - (number / 100) * 100) / 10) * 10 - 1]);
            } else if ((number - (number / 100) * 100) - ((number - (number / 100) * 100) / 10) * 10 - 1 < 0) {
                System.out.print(singleNumber[number / 100 - 1] + " hundred " + firstDouble[(number - (number / 100) * 100) / 10 - 2]);
            } else {
                System.out.print(singleNumber[number / 100 - 1] + " hundred " + firstDouble[(number - (number / 100) * 100) / 10 - 2] + " " + singleNumber[(number - (number / 100) * 100) - ((number - (number / 100) * 100) / 10) * 10 - 1]);
            }
        } else {
            System.out.print("ngoài khả năng");
        }
    }
}

