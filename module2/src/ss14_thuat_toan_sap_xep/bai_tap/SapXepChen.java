package ss14_thuat_toan_sap_xep.bai_tap;

public class SapXepChen {
    public static void main(String[] args) {
        int[] array ={1,5,6,4,7,8,90,0,23,5,5};


        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        for (int i: array) {
            System.out.print(i+"\t");
        }
    }
}
