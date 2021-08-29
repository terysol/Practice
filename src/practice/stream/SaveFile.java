package practice.stream;

import java.awt.*;
import java.io.*;

public class SaveFile {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;

        try {
            bufferedWriter  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/solmin/Documents/nethru/practice/memo/test.txt")));

            while(true){
                String s = bufferedReader.readLine();
                if(s.equals("exit")) {
                    break;
                }
                bufferedWriter.write(s+"\n");
                bufferedWriter.flush();
                System.out.println(s);
            }

        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
