package ss8_clean_code_and_refactoring.thuc_hanh.doi_ten_bien_va_tach_hang;

import java.util.Scanner;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter firstOperand: ");
        int firstOperand=Integer.parseInt(scanner.nextLine());
        System.out.println("enter secondOperand: ");
        int secondOperand=Integer.parseInt(scanner.nextLine());
        System.out.println("enter operator : ");
        char operator= scanner.next().charAt(0);
        System.out.println(calculate(firstOperand,secondOperand,operator));
    }
}