package ss8_clean_code_and_refactoring.thuc_hanh.tach_bien;

import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number) {

        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ndbashj: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(fizzBuzz(number));
    }
}