package ss3_mang.thuc_hanh;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        int [] array={1,3,4,5,6,8,0,12,32,342,123};
        int index=minValue(array);
        System.out.print("Phần tử nhỏ nhất trong mảng là: "+array[index]);
    }

    public static int minValue(int [] array){
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
