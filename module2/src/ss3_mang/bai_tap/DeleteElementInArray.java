package ss3_mang.bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int X;

        System.out.print("Nhập số phần tử trong mảng: ");
        size = scanner.nextInt();

        int[] array = new int[size]; // tạo mảng nhập số ban đầu
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.print("\nNhập số muốn xoá: ");
        X = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==X) {
                for (int j = i; j < array.length-1; j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
                i--;
            }
        }
        //In ra kết quả mảng đã xoá phần tử
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }

    }
}
