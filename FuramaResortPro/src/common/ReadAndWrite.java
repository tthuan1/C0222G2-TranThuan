package common;


import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import model.function.Booking;
import model.function.Contract;
import model.people.Customer;
import model.people.Employee;
import model.people.Person;

import java.io.*;
import java.net.CacheRequest;
import java.util.*;

public class ReadAndWrite {

    private static void writeFile(List<String> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFileCustomer(List<Customer> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Customer e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }

    public static void writeFileEmployee(List<Employee> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Employee e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }

    public static void writeFileVilla(List<Villa> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Villa e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }
    public static void writeFileHouse(List<House> lists, String path) {
        List<String> list = new ArrayList<>();
        for (House e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }
    public static void writeFileRoom(List<Room> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Room e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }
    public static void writeFileBooking(List<Booking> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Booking e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }
    public static void writeFileContract(List<Contract> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Contract e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }

    public static void readFileCustomer(List<Customer> list) {
        try {
            FileReader fileReader = new FileReader("src/data/customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                list.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileEmployee(List<Employee> list) {
        try {
            FileReader fileReader = new FileReader("src/data/employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Employee employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9]));
                list.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileHouse(List<House> list) {
        try {
            FileReader fileReader = new FileReader("src/data/house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                House house = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                list.add(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileVilla(List<Villa> list) {
        try {
            FileReader fileReader = new FileReader("src/data/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Villa villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]), Integer.parseInt(temp[8]));
                list.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFileVillaMap(LinkedHashMap<Villa,Integer> list) {
        try {
            FileReader fileReader = new FileReader("src/data/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Villa villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]), Integer.parseInt(temp[8]));
                list.put(villa,1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileVillaMap(List<Villa> lists, String path) {
        List<String> list = new ArrayList<>();
        for (Villa e : lists) {
            list.add(e.convertLine());
        }
        writeFile(list, path);
    }

    public static void readFileRoom(List<Room> list) {
        try {
            FileReader fileReader = new FileReader("src/data/room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Room room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6]);
                list.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFileBooking(List<Booking> list) {
        try {
            FileReader fileReader = new FileReader("src/data/booking.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Booking booking = new Booking(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
                list.add(booking);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFileContract(List<Contract> list) {
        try {
            FileReader fileReader = new FileReader("src/data/contract.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Contract contract = new Contract(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5],Integer.parseInt(temp[6]),Integer.parseInt(temp[7]),Integer.parseInt(temp[8]));
                list.add(contract);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
