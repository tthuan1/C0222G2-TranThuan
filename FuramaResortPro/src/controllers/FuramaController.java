package controllers;

import common.Exception;
import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.print("------------------------------------------\n" +
                    "Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "Hãy nhập: ");
            String input = scanner.nextLine();
            int choose = Exception.checkChoice(input);
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
//                promotion();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.err.println("Số nhập "+choose+" không có trong danh sách!!");
                    displayMainMenu();
                    break;
            }
        } while (flag);
    }

    public static void employee() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        System.out.print("------------------------------------------\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n" + "" +
                "Hãy nhập: ");
        String input = scanner.nextLine();
        int chooseEmployee= Exception.checkChoice(input);
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
                System.err.println("Số nhập "+chooseEmployee+" không có trong danh sách!!");
                employee();
                break;
        }
    }

    public static void customer() {
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        System.out.print("------------------------------------------\n" +
                "1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n" +
                "Hãy nhập: ");
        String input = scanner.nextLine();
        int chooseCustomer = Exception.checkChoice(input);
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
                System.err.println("Số nhập "+chooseCustomer+" không có trong danh sách!!");
                customer();
        }
    }
    public static void facility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.print("------------------------------------------\n" +
                "1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n" +
                "Hãy Nhập: ");
        String chooseFacilityCheck = scanner.nextLine();
        int chooseFacility = Exception.checkChoice(chooseFacilityCheck);
        switch (chooseFacility) {
            case 1:
                facilityService.display();
                break;
            case 2:
                addFacility();
                break;
            case 3:
                facilityService.displayFacilityMaintenance();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.err.println("Số nhập "+chooseFacility+" không có trong danh sách!!");
                facility();
                break;
        }
    }

    public static void booking() {
        BookingServiceImpl bookingService =new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        System.out.print("------------------------------------------\n" +
                "1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n" +
                "Hãy nhập: ");
        String input = scanner.nextLine();
        int chooseBooking = Exception.checkChoice(input);
        switch (chooseBooking) {
            case 1:
                bookingService.add();
                break;
            case 2:
                bookingService.display();
                break;
            case 3:
                contactService.add();
                break;
            case 4:
                contactService.display();
                break;
            case 5:
                System.out.println("Edit contracts");
                break;
            case 6:
                return;
            default:
                System.err.println("Số nhập "+chooseBooking+" không có trong danh sách!!");
                booking();
        }
    }

    public static void addFacility() {
        System.out.print("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "Hãy nhập: ");
        String chooseFacilityCheck = scanner.nextLine();
        int chooseFacility = Exception.checkChoice(chooseFacilityCheck);
        switch (chooseFacility) {
            case 1:
                VillaImpl.add();
                break;
            case 2:
                HouseImpl.add();
                break;
            case 3:
                RoomImpl.add();
                break;
            case 4:
                return;
            default:
                System.err.println("Số nhập "+chooseFacility+" không có trong danh sách!!");
                addFacility();
        }
    }
}
