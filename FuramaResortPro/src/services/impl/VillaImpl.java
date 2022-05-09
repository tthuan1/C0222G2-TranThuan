package services.impl;

import common.ReadAndWrite;
import common.Regex;
import model.facility.Facility;
import model.facility.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VillaImpl {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Villa> listVilla = new ArrayList<>();
    static LinkedHashMap<Facility, Integer> listVillaMap = new LinkedHashMap<>();

    static {
//        listVilla.add(new Villa("SVVL-0001", "Villa1", 50.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2, 100));
//        listVilla.add(new Villa("SVVL-0002", "Villa2", 60.0, 2000000.00, 10, "THEO NGÀY", "VIP", 3, 150));
//        listVilla.add(new Villa("SVVL-0003", "Villa3", 70.0, 3000000.00, 20, "THEO NGÀY", "VIP", 4, 200));
//        ReadAndWrite.writeFile( listVilla,"src/data/villa.csv");
//        for (int i = 0; i < listVilla.size(); i++) {
//            listVillaMap.put(listVilla.get(i), 1);
//        }
        ReadAndWrite.readFileVilla(listVilla);
        for (Villa villa : listVilla) {
            listVillaMap.put(villa, 1);
        }
    }

    public static void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        Regex.regexMaDichVuVilla(maDichVu);

        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        Regex.regexTen(tenDichVu);

        System.out.print("Nhập diện tích sử dụng: ");
        Regex.regexDienTichSuDung(scanner.nextLine());
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chi phí thuê: ");
        Regex.regexChiPhiThue(scanner.nextLine());
        double chiPhiThue = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số lượng người: ");
        Regex.regexSoLuongNguoi(scanner.nextLine());
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        Regex.regexTen(kieuThue);

        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        Regex.regexTen(tieuChuanPhong);

        System.out.print("Nhập số tầng: ");
        Regex.regexSoTang(scanner.nextLine());
        int soTang = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập diện tích hồ bơi: ");
        Regex.regexDienTichSuDung(scanner.nextLine());
        int dienTichHoBoi = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang, dienTichHoBoi);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.addFacility(villa, listVilla);
        ReadAndWrite.writeFileVilla(listVilla, "src/data/villa.csv");
    }
}
