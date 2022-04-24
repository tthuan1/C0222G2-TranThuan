package ss16_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;

public class DocFileCsv {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/tranthuan/Desktop/TranThuan/C0222G2-TranThuan/module2/src/ss16_text_file/bai_tap/Country.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line="";
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại");
        }
    }

}
