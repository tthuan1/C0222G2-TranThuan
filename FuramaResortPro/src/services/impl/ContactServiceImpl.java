package services.impl;

import common.Exception;
import common.ReadAndWrite;
import model.function.Booking;
import model.function.Contract;
import services.ContactService;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    static ArrayList<Contract> listContract = new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    static {
        ReadAndWrite.readFileContract(listContract);
    }
    @Override
    public void add() {
        System.out.print("Nhập mã booking : ");
        String maBooking=scanner.nextLine();

        System.out.print("Nhập ngày bắt đầu : ");
        String ngayBatDau=scanner.nextLine();

        System.out.print("Nhập ngày kết thúc : ");
        String ngayKetThuc=scanner.nextLine();

        System.out.print("Nhập mã khách hàng : ");
        String maKhachHang=scanner.nextLine();

        System.out.print("Nhập tên dịch vụ : ");
        String tenDichVu=scanner.nextLine();

        System.out.print("Nhập loại dịch vụ : ");
        String loaiDichVu=scanner.nextLine();

        System.out.print("Nhập Số hợp đồng : ");
        String INPUT=scanner.nextLine();
        int soHopDong=Exception.checkChoice(INPUT);;
        Exception.checkChoice(INPUT);
        System.out.print("Nhập Số tiền cọc : ");
        INPUT=scanner.nextLine();
        int soTienCoc=Exception.checkChoice(INPUT);
        System.out.print("Nhập ổng số tiền thanh toán : ");
        INPUT=scanner.nextLine();
        int tongTienThanhToan=Exception.checkChoice(INPUT);;
        Contract contract=new Contract(maBooking,ngayBatDau,ngayKetThuc,maKhachHang,tenDichVu,loaiDichVu,soHopDong,soTienCoc,tongTienThanhToan);
        listContract.add(contract);
        ReadAndWrite.writeFileContract(listContract,"src/data/contract.csv");
    }

    @Override
    public void display() {
        for (Contract contract : listContract) {
            System.out.println(contract);
        }
    }
}
