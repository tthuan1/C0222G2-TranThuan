package ss3_mang.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int x;
        int index;

        Scanner scanner = new Scanner(System.in);


        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        System.out.print("Mảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.print("\nNhập số cần chèn: ");
        x = scanner.nextInt();
        System.out.print("\nNhập vị trí cần chèn: ");
        index = scanner.nextInt();
        if (index <= -1 || index >= array.length) {
            System.out.print("Không chèn được phần tử vào mảng\n");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
        }

        System.out.print("\nMảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }


    }
}
