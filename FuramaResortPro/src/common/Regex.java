package common;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEXMADICHVUVILLA = "^(SVVL-)\\d{4}$";
    public static final String REGEXMADICHVUHOUSE = "^(SVHO-)\\d{4}$";
    public static  final String REGEXMADICHVUROOM = "^(SVRO-)\\d{4}$";
    public static final String REGEXTEN = "^[A-Z][a-z]{1,}[0-9]{0,}$";
    public static final String REGEXDIENTICHSUDUNG = "^([3-9]\\d|\\d{3,}).?\\d*$";
    public static final String REGEXCHIPHITHUE = "^\\d+,?\\d*$";
    public static final String REGEXSOLUONGNGUOI = "^(1)\\d$|^[1-9]?$";
    public static final String REGEXSOTANG = "^\\d*$";
    public static final String REGEXNGAYSINH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


//    public static void regex(String input,String REGEX){
//        while (!input.matches(REGEX)) {
//            System.err.println("Nhập không đúng định dạng !!" +
//                    "\nYêu cầu nhập lại: ");
//            input = scanner.nextLine();
//        }
//    }

//
    public static void regexMaDichVuRoom(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUROOM)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }
    public static void regexMaDichVuVilla(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUVILLA)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }
//
    public static void regexMaDichVuHouse(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUHOUSE)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }
//
    public static void regexTen(String tenDichVu) {
        while (!tenDichVu.matches(REGEXTEN)) {
            System.out.println("Nhập không đúng định dạng  !!" +
                    "\nYêu cầu nhập lại: ");
            tenDichVu = scanner.nextLine();
        }
    }
//
    public static void regexDienTichSuDung(String dienTichSuDung) {
        while (!dienTichSuDung.matches(REGEXDIENTICHSUDUNG)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            dienTichSuDung = scanner.nextLine();
        }
    }
//
    public static void regexChiPhiThue(String chiPhiThue) {
        while (!chiPhiThue.matches(REGEXCHIPHITHUE)) {
            System.out.println("Nhập không phải số dương !!" +
                    "\nYêu cầu nhập lại: ");
            chiPhiThue = scanner.nextLine();
        }
    }
//
    public static void regexSoLuongNguoi(String soLuongNguoi) {
        while (!soLuongNguoi.matches(REGEXSOLUONGNGUOI)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            soLuongNguoi = scanner.nextLine();
        }
    }

    public static void regexSoTang(String soTang) {
        while (!soTang.matches(REGEXSOTANG)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            soTang = scanner.nextLine();
        }
    }
    public static void regexNgaySinh(String ngaySinh) {
        while (!ngaySinh.matches(REGEXNGAYSINH)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            ngaySinh = scanner.nextLine();
        }
    }
//

}
