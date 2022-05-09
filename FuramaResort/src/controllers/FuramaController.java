package controllers;

import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {

        boolean flag = true;
        do {
            System.out.println("\nỨng dụng quản lý khu nghỉ dưỡng Furama\n" +
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
        EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
        System.out.print("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        int chooseEmployee = Integer.parseInt(scanner.nextLine());
        switch (chooseEmployee) {
            case 1:
                employeeServiceImpl.display();
                break;
            case 2:
                employeeServiceImpl.add();
                break;
            case 3:
                employeeServiceImpl.edit();
                break;
            case 4:
                return;
            default:
                break;
        }
    }

    public static void customer(){
        CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        int chooseCustomer=Integer.parseInt(scanner.nextLine());
        switch (chooseCustomer) {
            case 1:
                customerServiceImpl.display();
                break;
            case 2:
                customerServiceImpl.add();
                break;
            case 3:
                customerServiceImpl.edit();
                break;
            case 4:
                return;
            default:
                break;
        }
    }

    public static void facility(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        int chooseFacility=Integer.parseInt(scanner.nextLine());
        switch (chooseFacility) {
            case 1:
                facilityService.display();
                break;
            case 2:
                facilityAdd();
                break;
            case 3:
                facilityService.displayFacilityMaintenance();
                break;
            case 4:
                displayMainMenu();
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

    public static void facilityAdd (){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        System.out.print(
                "1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" + "Nhập: ");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                facilityService.addVilla();
                break;
            case 2:
                facilityService.addHouse();
                break;
            case 3:
                facilityService.addRoom();
                break;
            case 4:
                facility();
                break;
            default:
                break;
        }
    }
}
