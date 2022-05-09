package common;

import sun.invoke.empty.Empty;

import java.util.Scanner;

public class Exception {
    static Scanner scanner = new Scanner(System.in);

    public static int checkChoice(String choice) {
        boolean check = true;
        int choice1 = 0;
        while (check) {
            try {
                choice1 = Integer.parseInt(choice);
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Lỗi: " + e.getMessage() +
                        "\nHãy nhập lại!");
                choice = scanner.nextLine();
            }
        }
        return choice1;
    }


}
