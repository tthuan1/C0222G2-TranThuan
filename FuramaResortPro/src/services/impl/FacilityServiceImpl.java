package services.impl;


import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import services.FacilityService;

import java.util.*;
import java.util.List;

import static services.impl.HouseImpl.listHouse;
import static services.impl.VillaImpl.listVilla;
import static services.impl.RoomImpl.listRoom;

public class FacilityServiceImpl implements FacilityService {
    static LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
    static ArrayList<Facility> maintenanceList = new ArrayList<>();

    static {
        for (Villa villa : listVilla) {
            facilityList.put(villa, 1);
        }
        for (Room room : listRoom) {
            facilityList.put(room, 1);
        }
        for (House house : listHouse) {
            facilityList.put(house, 1);
        }
    }

    public void addFacility(Facility facility, List list) {
        Set<Facility> facilityKey = facilityList.keySet();

        if (facilityList.isEmpty()) {
            facilityList.put(facility, 1);
        } else {
            boolean flag = true;
            for (Facility key : facilityKey) {
                if (facility.equals(key)) {
                    facilityMaintenanceCheck(key);
                    facilityList.put(key, facilityList.get(key) + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                facilityList.put(facility, 1);
                list.add(facility);
            }
        }
    }

    @Override
    public void add() {}

    @Override
    public void display() {
        Set<Facility> facilityKey = facilityList.keySet();
        for (Facility facility: facilityKey) {
            System.out.println(facility);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        if (!maintenanceList.isEmpty()) {
            for (Facility facility : maintenanceList) {
                System.out.println(facility);
            }
        } else {
            System.err.println("Cơ sở bảo trì trống!");
        }
    }

    @Override
    public void facilityMaintenanceCheck(Facility facility) {
        if (facilityList.get(facility) > 1) {
            System.err.println("Dịch vụ đang bảo trì!");
            maintenanceList.add(facility);
            facilityList.put(facility, 0);
        }
    }

}
