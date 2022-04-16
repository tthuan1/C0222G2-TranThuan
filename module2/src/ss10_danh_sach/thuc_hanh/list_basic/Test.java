package ss10_danh_sach.thuc_hanh.list_basic;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList();

        for (int i = 0; i < (int) (Math.random() * 1000) + 1; i++) {
            listInteger.add((int) (Math.random() * 100) + 1);
        }

        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println("element " + (i + 1) + ": " + listInteger.get(i));
        }


//        listInteger.get(6);
//        System.out.println("element 30: "+listInteger.get(30));
//
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
