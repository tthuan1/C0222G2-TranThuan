package ss14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] array) {
        insertionSort(list);
        for (int i:list) {
            System.out.println(i);
        }
    }
}
