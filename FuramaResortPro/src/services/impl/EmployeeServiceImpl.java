package services.impl;


import common.Exception;
import common.ReadAndWrite;
import controllers.FuramaController;
import jdk.jfr.Percentage;
import model.people.Employee;
import model.people.Person;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> listEmployee = new ArrayList<>();
    static {
        ReadAndWrite.readFileEmployee(listEmployee);
    }
    @Override
    public void add() {
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String date = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập chứng minh nhân dân: ");
        String cmnd = scanner.nextLine();
        System.out.print("Nhập SĐT: ");
        String sdt = scanner.nextLine();
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập mã nhân viên: ");
        String maNhanVien = scanner.nextLine();
        System.out.print("Nhập trình độ nhân viên: ");
        String trinhDo = scanner.nextLine();
        System.out.print("Nhập vị trí nhân viên: ");
        String viTri = scanner.nextLine();
        System.out.print("Nhập số lương: ");
        int luong = Exception.checkChoice(scanner.nextLine());
        Employee employee = new Employee(maNhanVien, name,date,gioiTinh,cmnd,sdt,email,trinhDo,viTri,luong);
        listEmployee.add(employee);
        ReadAndWrite.writeFileEmployee(listEmployee,"src/data/employee.csv");
    }

    @Override
    public void display() {
        for (int i = 0; i < listEmployee.size() ; i++) {
            System.out.println(listEmployee.get(i));
        }
    }

    public void edit() {
        System.out.print("Nhập mã nhân viên cần sửa: ");
        String update = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < listEmployee.size(); i++) {
            if (update.equals(listEmployee.get(i).getEmployeeCode())) {
                count++;
                System.out.print("Nhập tên nhân viên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập ngày sinh: ");
                String date = scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                String gioiTinh = scanner.nextLine();
                System.out.print("Nhập chứng minh nhân dân: ");
                String cmnd = scanner.nextLine();
                System.out.print("Nhập SĐT: ");
                String sdt = scanner.nextLine();
                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                System.out.print("Nhập mã nhân viên: ");
                String maNhanVien = scanner.nextLine();
                System.out.print("Nhập trình độ nhân viên: ");
                String trinhDo = scanner.nextLine();
                System.out.print("Nhập vị trí nhân viên: ");
                String viTri = scanner.nextLine();
                System.out.print("Nhập số lương: ");
                int luong = Integer.parseInt(scanner.nextLine());
                Employee employee = new Employee(maNhanVien,name,date, gioiTinh, cmnd, sdt, email,  trinhDo, viTri, luong);
                listEmployee.set(i, employee);
                ReadAndWrite.writeFileEmployee(listEmployee,"src/data/employee.csv");
            }
        }
        if (count == 0) {
            System.out.println("Không tiềm thấy số mã nhân viên " + update + " này !!\n");
            FuramaController.employee();
        }
    }
}
