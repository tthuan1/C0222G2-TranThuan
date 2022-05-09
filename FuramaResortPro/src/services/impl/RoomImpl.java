package services.impl;

import common.ReadAndWrite;
import common.Regex;
import model.facility.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomImpl {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> listRoom = new ArrayList<>();

    static {
//        listRoom.add(new Room("SVRO-0001", "Room1", 30.0, 1000.90, 5, "theo thang", "Không có"));
//        listRoom.add(new Room("SVRO-0002", "Room2", 40.0, 2000.90, 10, "theo thang", "Free thảo dược"));
//        listRoom.add(new Room("SVRO-0003", "Room3", 50.0, 3000.90, 20, "theo thang", "G dịch vụ"));
//        ReadAndWrite.writeFile( listRoom,"src/data/room.csv");
        ReadAndWrite.readFileRoom(listRoom);
    }

    public static void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        Regex.regexMaDichVuRoom(maDichVu);

        System.out.print("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        Regex.regexTen(tenDichVu);

        System.out.print("Nhập diện tích sử  dụng: ");
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

        System.out.print("Nhập dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();

        Room room = new Room(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhi);
        listRoom.add(room);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.addFacility(room, listRoom);
        ReadAndWrite.writeFileRoom(listRoom, "src/data/room.csv");
    }
}
