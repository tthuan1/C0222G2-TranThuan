package services.impl;

import common.ReadAndWrite;
import common.Regex;
import model.facility.Facility;
import model.facility.House;
import model.facility.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseImpl {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<House> listHouse = new ArrayList<>();

    static {
//        listHouse.add(new House("SVHO-0001", "House1", 40.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2));
//        listHouse.add(new House("SVHO-0002", "House2", 50.0, 2000000.00, 10, "THEO NGÀY", "VIP", 3));
//        listHouse.add(new House("SVHO-0003", "House3", 60.0, 3000000.00, 15, "THEO NGÀY", "VIP", 4));
//        ReadAndWrite.writeFile( listHouse,"src/data/house.csv");
        ReadAndWrite.readFileHouse(listHouse);
    }

    public static void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        Regex.regexMaDichVuHouse(maDichVu);

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

        House house = new House(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        listHouse.add(house);
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        facilityService.addFacility(house,listHouse);
        ReadAndWrite.writeFileHouse(listHouse, "src/data/house.csv");
    }
}
