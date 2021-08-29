package practice.stream;

import java.io.*;

public class File_er {
	public static void main(String[] args) {
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\res.txt");
			FileInputStream input = new FileInputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\res.txt");
			
			OutputStreamWriter writer=new OutputStreamWriter(output,"euc-kr");
			writer.write("ABCDEFG");
			writer.close();
			InputStreamReader reader =  new InputStreamReader(input,"euc-kr");
			
			
			
			System.out.println(reader.read());
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
