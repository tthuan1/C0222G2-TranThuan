package ss2_vong_lap.bai_tap;

public class PrimesBelow100 {
    public static void main(String[] args) {
        int n = 0;

        while (n < 100) {
            if (kiemTraSNT(n)) {
                System.out.print(n + "\n");
            }
            n++;
        }
    }

    public static boolean kiemTraSNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
