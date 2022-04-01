package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập cân nặng: ");
            double weight=Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập chiều cao: ");
            double height=Double.parseDouble(scanner.nextLine());

            double  bmi = weight / Math.pow(height, 2);
        if (bmi < 18){
            System.out.print("Thiếu cân");
        }
        else if (bmi < 25.0){
            System.out.print("Bình thường");
        }
        else if (bmi < 30.0){
            System.out.print("Mập");
        }
        else{
            System.out.print("Béo phì");
        }
    }
}
