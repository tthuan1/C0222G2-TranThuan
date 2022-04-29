package common;

import model.employee.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {


    public void writeFile(List list, String path, boolean overWrite) {
        try {
            FileWriter fileWriter = new FileWriter(path,overWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Object o : list) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("không có file này");
        }
    }
    public void readFile(List list, String path){
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("không có file này");
        }
    }
}
