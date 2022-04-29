package common;

import model.coSoVatChat.Facility;
import model.employee.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ReadAndWrite {


    public static void writeFile(Collection list, String path, boolean overWrite) {
        try {
            FileWriter fileWriter = new FileWriter(path,overWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Object o : list) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeFile(Map list, String path, boolean overWrite) {
        try {
            FileWriter fileWriter=new FileWriter(path,overWrite);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile(Collection list, String path){
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
    public static void readFile(Map list, String path){
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
