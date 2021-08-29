import java.io.*;

public class Test {
    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Hello World");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("aaa")));
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
