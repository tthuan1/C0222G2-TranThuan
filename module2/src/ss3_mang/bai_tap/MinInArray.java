package ss3_mang.bai_tap;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Độ dài mảng: ");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.print("Mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.print("\nCó số nhỏ nhất là: " + min);
    }
}
