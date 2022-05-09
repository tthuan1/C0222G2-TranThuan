package services.impl;

import common.ReadAndWrite;
import model.function.Booking;
import model.people.Customer;
import services.BookingService;

import java.util.ArrayList;
import java.util.Scanner;


public class BookingServiceImpl implements BookingService {
    static ArrayList<Booking> listBooking = new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);

    static {
        ReadAndWrite.readFileBooking(listBooking);
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
        Booking booking=new Booking(maBooking,ngayBatDau,ngayKetThuc,maKhachHang,tenDichVu,loaiDichVu);
        listBooking.add(booking);
        ReadAndWrite.writeFileBooking(listBooking,"src/data/booking.csv");
    }

    @Override
    public void display() {
        for (Booking booking : listBooking) {
            System.out.println(booking);
        }
    }


}
