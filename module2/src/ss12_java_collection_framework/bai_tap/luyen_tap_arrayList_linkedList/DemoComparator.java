package ss12_java_collection_framework.bai_tap.luyen_tap_arrayList_linkedList;

import java.util.Comparator;

public class DemoComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()- o1.getPrice();
    }
}
