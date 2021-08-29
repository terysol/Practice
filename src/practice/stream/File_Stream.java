package practice.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Stream {
	public static void main(String[] args) {
		try {
			FileOutputStream fileoutputstream = new FileOutputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\result.txt");
			FileInputStream fileinputstream = new FileInputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\result.txt");
			
			String msg="��";
			byte []bytes = msg.getBytes();
			fileoutputstream.write(bytes);
			fileoutputstream.close();
			
			byte [] result = new byte[100];
			int res= fileinputstream.read(result);
			System.out.println((char)res);
		
			fileinputstream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
