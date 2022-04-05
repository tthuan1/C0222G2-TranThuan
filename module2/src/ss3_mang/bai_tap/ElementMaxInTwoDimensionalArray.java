package ss3_mang.bai_tap;

import java.util.Scanner;

public class ElementMaxInTwoDimensionalArray {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int row=scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int col=scanner.nextInt();
        int[][] array= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Mảng là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }


        int max=array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
        }

        System.out.println("\nPhần tử lớn nhất trong mảng là: "+max);





    }
}
