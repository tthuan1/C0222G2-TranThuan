package ss3_mang.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Độ dài mảng 1: ");
        size1 = scanner.nextInt();
        System.out.print("Độ dài mảng 2: ");
        size2 = scanner.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử của mảng 1 thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử của mảng 2 thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = size1; i < array3.length; i++) {
            array3[i] = array2[count];
            count++;
        }


        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }


    }
}
