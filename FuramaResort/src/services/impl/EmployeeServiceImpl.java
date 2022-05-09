package services.impl;

import common.ReadAndWrite;
import controllers.FuramaController;
import model.employee.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> listEmployee = new ArrayList<>();

    static {
//        listEmployee.add(new Employee("001","thuận", "18-09-1999",
//                "nam", "123456789", "0944191105", "tranthuan@gmail.com",
//                 "Đại học", "Giám đốc", 10000000));
//        listEmployee.add(new Employee("002","hoàn", "01-04-1996",
//                "nam", "987654320", "4623178946", "tvhoan@gmail.com",
//                 "Đại học", "Phó giám đốc", 8000000));
//        listEmployee.add(new Employee("003","phúc", "24-02-1996",
//                "nam", "46321786487", "09053127689", "phucnhatban@gmail.com",
//                 "Trung cấp", "giám sát", 7000000));
//        listEmployee.add(new Employee("004","phương", "16-07-1999",
//                "nam", "7831290739", "0981786267", "tdphuong@gmail.com",
//                 "Đại học", "Giám đốc", 10000000));
//        ReadAndWrite.writeFile(listEmployee,"src/data/employee.csv",false);
//        ReadAndWrite.readFileEmployee(listEmployee);
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
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
        int luong = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(maNhanVien, name,date,gioiTinh,cmnd,sdt,email,trinhDo,viTri,luong);
        listEmployee.add(employee);
        ReadAndWrite.writeFile(listEmployee,"src/data/employee.csv",false);
    }

    @Override
    public void display() {
        ReadAndWrite.readFileEmployee(listEmployee);
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    @Override
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
                ReadAndWrite.writeFile(listEmployee,"src/data/employee.csv",false);
            }
        }
        if (count == 0) {
            System.out.println("Không tiềm thấy số mã nhân viên " + update + " này !!\n");
            FuramaController.employee();
        }
    }

    @Override
    public void delete() {

    }
}
