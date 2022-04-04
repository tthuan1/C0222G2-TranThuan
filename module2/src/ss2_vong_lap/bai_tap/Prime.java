package ss2_vong_lap.bai_tap;

public class Prime {
    public static void main(String[] args) {
        int count = 0;//biến đếm
        int n = 0;

        while (count <= 20) {
            if (kiemTraSNT(n)){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
    public static boolean kiemTraSNT(int n){
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
