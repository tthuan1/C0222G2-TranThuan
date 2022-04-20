package controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {

        boolean flag = true;
        do {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employee();
                    break;
                case 2:
                    customer();
                    break;
                case 3:
                    facility();
                    break;
                case 4:
                    booking();
                    break;
                case 5:
                    promotion();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }

    public static void employee() {
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Display list employees");
                break;
            case 2:
                System.out.println("add");
                break;
            case 3:
                System.out.println("Edit employee");
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                break;
        }
    }

    public static void customer(){
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Display list customers");
                break;
            case 2:
                System.out.println("add customer");
                break;
            case 3:
                System.out.println("Edit customer");
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                break;
        }
    }

    public static void facility(){
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Display list facility");
                break;
            case 2:
                System.out.println("add facility");
                break;
            case 3:
                System.out.println("Display list facility maintenanc");
                break;
            case 4:
                displayMainMenu();;
                break;
            default:
                break;
        }
    }
    public static void booking(){
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Add new booking");
                break;
            case 2:
                System.out.println("Display list booking");
                break;
            case 3:
                System.out.println("Create new constracts");
                break;
            case 4:
                System.out.println("Display list contracts");
                break;
            case 5:
                System.out.println("Edit contracts");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                break;
        }
    }
    public static void promotion(){
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Display list customers use service");
                break;
            case 2:
                System.out.println("Display list customers get voucher");
                break;
            case 3:
                displayMainMenu();
                break;
            default:
                break;
        }
    }
}
