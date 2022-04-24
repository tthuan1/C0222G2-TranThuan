import java.util.Scanner;

public class test {
    static int[] arr={1,2,3,4,5,6};

    public static void main(String[] args) {
        t();
    }
    public static void t(){
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.print("nhập: ");
            int test=Integer.parseInt(scanner.nextLine());
            System.out.println(arr[test]);
        }catch (Exception e){
            System.out.println("bạn đa nhập sai");
            t();
        }

    }
}
