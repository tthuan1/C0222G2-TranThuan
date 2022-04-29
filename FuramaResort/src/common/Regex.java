package common;

import java.util.Scanner;

public class Regex {
    Scanner scanner = new Scanner(System.in);
    /*public static*/ final String REGEXMADICHVUVILLA = "^(SVVL-)\\d{4}$";
    /*public static*/ final String REGEXMADICHVUHOUSE = "^(SVHO-)\\d{4}$";
    /*public static*/ final String REGEXMADICHVUROOM = "^(SVRO-)\\d{4}$";
    /*public static*/ final String REGEXTEN = "^[A-Z][a-z\\d]*$";
    /*public static*/ final String REGEXDIENTICHSUDUNG = "^[1-9]\\d{2,}$|^[3-9]\\d*$";
    /*public static*/ final String REGEXCHIPHITHUE = "^\\d+,?\\d*$";
    /*public static*/ final String REGEXSOLUONGNGUOI = "^(1)\\d$|^[1-9]?$";
    /*public static*/ final String REGEXSOTANG = "^\\d*$";

    public void regexMaDichVuRoom(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUROOM)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }
    public void regexMaDichVuVilla(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUVILLA)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }

    public void regexMaDichVuHouse(String maDichVu) {
        while (!maDichVu.matches(REGEXMADICHVUHOUSE)) {
            System.out.println("Nhập không đúng định dạng mã dịch vụ !!" +
                    "\nYêu cầu nhập lại lại đây theo định dạng SVXX-YYYY: ");
            maDichVu = scanner.nextLine();
        }
    }

    public void regexTen(String tenDichVu) {
        while (!tenDichVu.matches(REGEXTEN)) {
            System.out.println("Nhập không đúng định dạng  !!" +
                    "\nYêu cầu nhập lại: ");
            tenDichVu = scanner.nextLine();
        }
    }

    public void regexDienTichSuDung(String dienTichSuDung) {
        while (!dienTichSuDung.matches(REGEXDIENTICHSUDUNG)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            dienTichSuDung = scanner.nextLine();
        }
    }

    public void regexChiPhiThue(String chiPhiThue) {
        while (!chiPhiThue.matches(REGEXCHIPHITHUE)) {
            System.out.println("Nhập không phải số dương !!" +
                    "\nYêu cầu nhập lại: ");
            chiPhiThue = scanner.nextLine();
        }
    }

    public void regexSoLuongNguoi(String soLuongNguoi) {
        while (!soLuongNguoi.matches(REGEXSOLUONGNGUOI)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            soLuongNguoi = scanner.nextLine();
        }
    }

    public void regexSoTang(String soTang) {
        while (!soTang.matches(REGEXSOTANG)) {
            System.out.println("Nhập không đúng định dạng !!" +
                    "\nYêu cầu nhập lại: ");
            soTang = scanner.nextLine();
        }
    }


}
