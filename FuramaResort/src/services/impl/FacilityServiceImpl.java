package services.impl;

import model.coSoVatChat.Facility;
import model.coSoVatChat.House;
import model.coSoVatChat.Room;
import model.coSoVatChat.Villa;
import model.employee.Customer;
//import model.facility.Facility;
//import model.facility.House;
//import model.facility.Room;
import services.FacilityService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<Integer, Facility> facilityList = new LinkedHashMap<>();

    //   tenDichVu, dienTichSuDung, chiPhiThue soLuongNguoiToiDa, kieuThue,  tieuChuanPhong, soTang
    static {
        facilityList.put(1, new House("HOUSE1", "100", 1000000.00,
                5, "THEO NGÀY", "VIP", 2));
        facilityList.put(2, new Room("room","hô bơi",1000.90,
                12231,"theo thang","hihi"));
//         tenDichVu,  dienTichSuDung,  chiPhiThue,  soLuongNguoiToiDa,  kieuThue,  dichVuMienPhi
        facilityList.put(3, new Villa("vila", "100.0", 1000000.00,
                5, "THEO NGÀY", "VIP", 2,122));
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
