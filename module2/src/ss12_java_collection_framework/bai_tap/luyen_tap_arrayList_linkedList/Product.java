package ss12_java_collection_framework.bai_tap.luyen_tap_arrayList_linkedList;

public class Product implements Comparable<Product>{
    private Integer id;
    private String name;
    private Integer price;

    public Product() {
    }

    public Product(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " +
                "id:" + id +
                ", name: " + name +
                ", price: " + price;
    }

    @Override
    public int compareTo(Product o) {
//        if (this.price - o.getPrice() > 0) {
//            return 1;
//        } else if (this.price - o.price < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
        return this.price - o.getPrice();
    }

//    @Override
//    public int compare(Product o1, Product o2) {
//        return o1.getPrice()- o2.getPrice();
//    }
}
