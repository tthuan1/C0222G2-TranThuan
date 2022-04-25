package ss17_binary_file_serialization.bai_tap.common;

import ss17_binary_file_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writeFile(List<Product> product) {
        try {
            FileOutputStream fos = new FileOutputStream("src/ss17_binary_file_serialization/bai_tap/data/data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/ss17_binary_file_serialization/bai_tap/data/data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
