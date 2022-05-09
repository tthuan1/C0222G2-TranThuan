package services.impl;

import common.ReadAndWrite;
import controllers.FuramaController;
import model.employee.Customer;
import services.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService  {

    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Customer> listCustomer = new LinkedList<>();

    static{
//        listCustomer.add(new Customer("001","Huyền","18-03-1999","nữ",
//                "3612789361","0905001001", "ntbhuyen@gmail.com","Diamond","06 Nam thành- đà nẵng"));
//        listCustomer.add(new Customer("002","Thuận","18-09-1999","Nam",
//                "084446","0944192105","tthuan.@gmail.com","Platinium","Đà Nẵng"));
//        listCustomer.add(new Customer("003","Vũ","19-03-1999","nam",
//                "34678123","0905123211", "nhvu@gmail.com","Gold","06 Nam thành- đà nẵng"));
//        listCustomer.add(new Customer("004","Lộc","16-4-1999","Nam",
//                "7312893","2893297104","pdloc.@gmail.com","Silver","Đà Nẵng"));
//        listCustomer.add(new Customer("005","Tân","05-07-1999","Nam",
//                "53647289","6381279412","pttan.@gmail.com","Member","Đà Nẵng"));
//        ReadAndWrite.writeFile(listCustomer,"src/data/customer.csv",false);
        ReadAndWrite.readFileCustomer(listCustomer);
    }




    @Override
    public void add() {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh khách hàng: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính khách hàng: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập chứng minh nhân dân khách hàng: ");
        String identityCard = scanner.nextLine();
        System.out.print("Nhập SĐT khách hàng: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập email khách hàng");
        String email = scanner.nextLine();
        System.out.print("Nhập mã khách hàng: ");
        String customerCode = scanner.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String customerType = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer=new Customer( name,  dateOfBirth,  gender,  identityCard,  phoneNumber,  email,  customerCode,  customerType,  address);
        listCustomer.add(customer);
        ReadAndWrite.writeFile(listCustomer,"src/data/customer.csv",false);
    }

    @Override
    public void display() {
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        System.out.print("Nhập mã khách hàng cần sửa: ");
        String code = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (code.equals(listCustomer.get(i).getCustomerCode())) {
                System.out.print("Nhập lại tên khách hàng: ");
                String name = scanner.nextLine();
                System.out.print("Nhập lại ngày sinh khách hàng: ");
                String ngaySinh = scanner.nextLine();
                System.out.print("Nhập lại giới tính khách hàng: ");
                String gioiTinh = scanner.nextLine();
                System.out.print("Nhập lại chứng minh nhân dân khách hàng: ");
                String cmnd = scanner.nextLine();
                System.out.print("Nhập lại SĐT khách hàng: ");
                String sdt = scanner.nextLine();
                System.out.print("Nhập lại email khách hàng");
                String email = scanner.nextLine();
                System.out.print("Nhập lại mã khách hàng: ");
                String maKhachHang = scanner.nextLine();
                System.out.print("Nhập lại loại khách hàng: ");
                String loaiKhach = scanner.nextLine();
                System.out.print("Nhập lại địa chỉ: ");
                String diaChi = scanner.nextLine();
                Customer customer=new Customer(maKhachHang,name,ngaySinh,gioiTinh,cmnd,sdt,email,loaiKhach,diaChi);
                listCustomer.set(i,customer);
                ReadAndWrite.writeFile(listCustomer,"src/data/customer.csv",false);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tiềm thấy số mã khách hàng " + code + " này !!\n");
            FuramaController.customer();
        }
    }

    @Override
    public void delete() {

    }
}
