package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test {
    public void writeToFile(ArrayList<Studen> list) {
        try {
            FileWriter fileWriter = new FileWriter("data.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Studen o : list) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception ignored) {

        }
    }

    public static void main(String[] args) {
        Studen studen = new Studen("Thuận", 18, "C0222G2");
        Studen studen1 = new Studen("Hoàn", 19, "C0222G2");
        Studen studen2 = new Studen("Phúc", 20, "C0222G2");
        Studen studen3 = new Studen("Phương", 21, "C0222G2");
        ArrayList<Studen> list = new ArrayList<>();
        list.add(studen);
        list.add(studen1);
        list.add(studen2);
        list.add(studen3);
        try {
            FileReader fileReader = new FileReader("src/test/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {

        }
    }
}
