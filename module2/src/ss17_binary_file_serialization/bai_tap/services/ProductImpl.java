package ss17_binary_file_serialization.bai_tap.services;

import ss17_binary_file_serialization.bai_tap.common.WriteAndRead;
import ss17_binary_file_serialization.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IProduct {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1","1","1",11000,"1"));
        products.add(new Product("2","2","2",12000,"2"));
        products.add(new Product("3","3","3",13000,"3"));
        WriteAndRead.writeFile(products);

    }

    @Override
    public void add() {
        System.out.print("Nhập mã sản phẩm: ");
        String maSanPhamq=scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham=scanner.nextLine();
        System.out.print("Nhập hãn sãn xuất: ");
        String hanSanXuat=scanner.nextLine();
        System.out.print("Nhập giá: ");
        int gia=Integer.parseInt(scanner.nextLine());
        System.out.print("Mô tả khác: ");
        String maTaKhac=scanner.nextLine();
        products.add(new Product(maSanPhamq,tenSanPham,hanSanXuat,gia,maTaKhac));
        WriteAndRead.writeFile(products);
    }

    @Override
    public void display() {

        for (Product product : WriteAndRead.readFile()){
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
        String searchName=scanner.nextLine();
        for (Product product : products) {
            if (searchName.equals(product.getMaSanPham())) {
                System.out.println(product);
            }
        }
    }
}
