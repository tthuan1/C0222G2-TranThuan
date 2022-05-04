package services.impl;

import common.ReadAndWrite;
import common.Regex;
import model.coSoVatChat.Facility;
import model.coSoVatChat.House;
import model.coSoVatChat.Room;
import model.coSoVatChat.Villa;
//import model.facility.Facility;
//import model.facility.House;
//import model.facility.Room;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Regex regex = new Regex();
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
//        facilityList.put(new House("Mã dịch vụ", "Tên dịc vụ","Diện tích sử dụng","Chi phí thuê","Số lượng người tối đa", "Kiểu thuê", "Tiêu chuẩn phòng","Số tầng"));
//        facilityList.put(new House("SVHO-0001", "House1", 40.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2), 5);
//        ReadAndWrite.writeFile( facilityList,"src/data/house.csv",true);
//        facilityList.remove(new House("SVHO-0001", "House1", 40.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2));
//

//        facilityList.put(new Room("SVRO-0001", "Room1", 30.0, 1000.90, 12231, "theo thang", "hihi"), 5);
//        ReadAndWrite.writeFile( facilityList,"src/data/room.csv",true);
//        facilityList.remove(new Room("SVRO-0001", "Room1", 30.0, 1000.90, 12231, "theo thang", "hihi"));

//
//        facilityList.put(new Villa("SVVL-0001", "Villa1", 50.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2, 122), 1);
//        ReadAndWrite.writeFile( facilityList,"src/data/villa.csv",true);
//        facilityList.remove(new Villa("SVVL-0001", "Villa1", 50.0, 1000000.00, 5, "THEO NGÀY", "VIP", 2, 122));

    }


    @Override
    public void add() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n");
        int chooseFacility = Integer.parseInt(scanner.nextLine());
        switch (chooseFacility) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                System.out.println("exit");
                break;
            default:
                break;
        }
    }

    @Override
    public void display() {
//        for (Facility key : facilityList.keySet()) {
//            System.out.println(key);
//        }
        ReadAndWrite.readFile(facilityList,"src/data/villa.csv");
        System.out.println("------------------------------------------------");
        ReadAndWrite.readFile(facilityList,"src/data/house.csv");
        System.out.println("------------------------------------------------");
        ReadAndWrite.readFile(facilityList,"src/data/room.csv");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void addVilla() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
//        regex.regexMaDichVuVilla(maDichVu);
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
//        regex.regexTen(tenDichVu);
        System.out.print("Nhập diện tích sử dụng: ");
        String dienTichSuDung1 = scanner.nextLine();
//        regex.regexDienTichSuDung(dienTichSuDung1);
        double dienTichSuDung = Double.parseDouble(dienTichSuDung1);
        System.out.print("Nhập chi phí thuê: ");
        String chiPhiThue1 = scanner.nextLine();
//        regex.regexChiPhiThue(chiPhiThue1);
        double chiPhiThue = Double.parseDouble(chiPhiThue1);
        System.out.print("Nhập số lượng người: ");
        String soLuongNguoiToiDa1 = scanner.nextLine();
//        regex.regexSoLuongNguoi(soLuongNguoiToiDa1);
        int soLuongNguoiToiDa = Integer.parseInt(soLuongNguoiToiDa1);
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
//        regex.regexTen(kieuThue);
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
//        regex.regexTen(tieuChuanPhong);
        System.out.print("Nhập số tầng: ");
        String soTang1 = scanner.nextLine();
//        regex.regexSoTang(soTang1);
        int soTang = Integer.parseInt(soTang1);
        System.out.print("Nhập diện tích hồ bơi: ");
        String dienTichHoBoi1 = scanner.nextLine();
//        regex.regexDienTichSuDung(dienTichHoBoi1);
        int dienTichHoBoi = Integer.parseInt(dienTichHoBoi1);
        Villa villa=new Villa(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang, dienTichHoBoi);
        facilityList.put(villa,0);
        ReadAndWrite.writeFile( facilityList,"src/data/villa.csv",true);
        facilityList.remove(villa);
    }

    @Override
    public void addHouse() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
//        regex.regexMaDichVuHouse(maDichVu);
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
//        regex.regexTen(tenDichVu);
        System.out.print("Nhập diện tích sử dụng: ");
        String dienTichSuDung1 = scanner.nextLine();
//        regex.regexDienTichSuDung(dienTichSuDung1);
        double dienTichSuDung = Double.parseDouble(dienTichSuDung1);
        System.out.print("Nhập chi phí thuê: ");
        String chiPhiThue1 = scanner.nextLine();
//        regex.regexChiPhiThue(chiPhiThue1);
        double chiPhiThue = Double.parseDouble(chiPhiThue1);
        System.out.print("Nhập số lượng người: ");
        String soLuongNguoiToiDa1 = scanner.nextLine();
//        regex.regexSoLuongNguoi(soLuongNguoiToiDa1);
        int soLuongNguoiToiDa = Integer.parseInt(soLuongNguoiToiDa1);
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
//        regex.regexTen(kieuThue);
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
//        regex.regexTen(tieuChuanPhong);
        System.out.print("Nhập số tầng: ");
        String soTang1 = scanner.nextLine();
//        regex.regexSoTang(soTang1);
        int soTang = Integer.parseInt(soTang1);
        House house=new House(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        facilityList.put(house, 0);
        ReadAndWrite.writeFile( facilityList,"src/data/house.csv",true);
        facilityList.remove(house);
    }

    @Override
    public void addRoom() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
//        regex.regexMaDichVuRoom(maDichVu);
        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
//        regex.regexTen(tenDichVu);
        System.out.print("Nhập diện tích sử  dụng: ");
        String dienTichSuDung1 = scanner.nextLine();
//        regex.regexDienTichSuDung(dienTichSuDung1);
        double dienTichSuDung = Double.parseDouble(dienTichSuDung1);
        System.out.print("Nhập chi phí thuê: ");
        String chiPhiThue1 = scanner.nextLine();
//        regex.regexChiPhiThue(chiPhiThue1);
        double chiPhiThue = Double.parseDouble(chiPhiThue1);
        System.out.print("Nhập số lượng người: ");
        String soLuongNguoiToiDa1 = scanner.nextLine();
//        regex.regexSoLuongNguoi(soLuongNguoiToiDa1);
        int soLuongNguoiToiDa = Integer.parseInt(soLuongNguoiToiDa1);
        System.out.print("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
//        regex.regexTen(kieuThue);
        System.out.print("Nhập dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();
        Room room=new Room(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhi);
        facilityList.put(room, 0);
        ReadAndWrite.writeFile( facilityList,"src/data/room.csv",true);
        facilityList.remove(room);
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Facility key : facilityList.keySet()) {
            if (facilityList.get(key) > 4) {
                System.out.println(key);
            }
        }
    }

}
