package ss12_java_collection_framework.bai_tap.luyen_tap_arrayList_linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
//    thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp.
    Scanner scanner=new Scanner(System.in);
    static ArrayList<Product> product=new ArrayList<>();
    static {
        product.add(new Product(1,"điện thoại",5000000));
        product.add(new Product(2,"tivi",100000));
        product.add(new Product(4,"tủ lạnh",3000000));
    }

    public void add(){
        System.out.print("Nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name=scanner.nextLine();
        System.out.print("Nhập giá tiền: ");
        int price=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < product.size(); i++) {
            if (id==product.get(i).getId()){

            }
        }
        product.add(new Product(id,name,price));
    }

    public void display(){
        for (int i = 0; i < product.size(); i++) {
            System.out.println(product.get(i));
        }
    }

    public  void delete(int id){
        for (int i = 0; i < product.size(); i++) {
            if (id==product.get(i).getId() ){
                product.remove(i);
                i--;
            }
        }
    }

    public void search(String name){
        for (int i = 0; i < product.size(); i++) {
            if (name.equals(product.get(i).getName())){
                System.out.print(product.get(i));
            }
        }
    }
    public void update(int idCheck){
        int count=0;
        for (int i = 0; i < product.size() ; i++) {
            if (idCheck==product.get(i).getId()){
                System.out.print("Nhập id thay thế: ");
                int id=Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên sản phẩm thay thế: ");
                String name=scanner.nextLine();
                System.out.print("Nhập giá tiền thay thế: ");
                int price=Integer.parseInt(scanner.nextLine());
                product.get(i).setId(id);
                product.get(i).setName(name);
                product.get(i).setPrice(price);
                count++;
            }
        }
        if (count!=0){
            System.out.println("Update thành công");
        }else {
            System.out.println("không có id này");
        }
    }



}
