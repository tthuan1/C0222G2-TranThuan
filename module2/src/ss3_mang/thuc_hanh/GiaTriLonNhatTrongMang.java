package ss3_mang.thuc_hanh;

import java.util.Scanner;

public class GiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước: ");
            size=scanner.nextInt();
            if (size>20){
                System.out.print("Kích thước không được vượt quá 20\n");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Nhập phần tử "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int j = 0; j < array.length; j++) {
            if (max<array[j]){
                max=array[j];
                index=j+1;
            }
        }
        System.out.print("\nTài sản lớn nhất là: "+max+"\nỞ vị trí: "+index);


    }
}
