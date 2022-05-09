package common;

import model.coSoVatChat.Facility;
import model.coSoVatChat.House;
import model.employee.Customer;
import model.employee.Employee;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static void writeFile(Collection list, String path, boolean overWrite) {
        try {
            FileWriter fileWriter = new FileWriter(path,overWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Object o : list) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeFile(Map list, String path, boolean overWrite) {
        try {
            FileWriter fileWriter=new FileWriter(path,overWrite);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    public static void readFile(Collection list, String path){
//        try {
//            FileReader fileReader = new FileReader(path);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = bufferedReader.readLine())!= null) {
//                System.out.println(line);
////                list.add(line);
//            }
//        } catch (Exception e) {
//            System.err.println("không có file này");
//        }
//    }
    public static void readFileCustomer(Collection list) {
        try {
            FileReader fileReader = new FileReader("src/data/customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                customer = new Customer(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
                list.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFileEmployee(Collection list) {
        try {
            FileReader fileReader = new FileReader("src/data/employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Employee employee = new Employee(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],Integer.parseInt(temp[9]));
                list.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFile(Map list, String path){
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("không có file này");
        }
    }

    public static void readFileHouse(LinkedHashMap<Facility,Integer> list){
        try {
            FileReader fileReader = new FileReader("src/data/house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                for (int i = 0; i < temp.length; i++) {
                    System.out.println(temp[i]);
                }
                House house = new House(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3]),Integer.parseInt(temp[4]),temp[5],temp[6],Integer.parseInt(temp[7]));
//                list.put(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
