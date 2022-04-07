package ss2_vong_lap;

import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n * 2; j++) {
                 if (j-i==n||j+i==n){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j <= n * 2; j++) {
                if (j-i==n||j+i==n){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
