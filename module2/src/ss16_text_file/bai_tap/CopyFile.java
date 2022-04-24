package ss16_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/tranthuan/Desktop/TranThuan/C0222G2-TranThuan/module2/src/ss16_text_file/bai_tap/CopyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line ="";
                line = bufferedReader.readLine();
            System.out.println(line);
            System.out.println("Trong file có "+line.length()+" kí tự");
        } catch (Exception e) {
            System.err.println("Fie không tồn tại");
        }
    }
}
