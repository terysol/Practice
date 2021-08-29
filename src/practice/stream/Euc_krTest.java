package practice.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Euc_krTest {
	public static void main(String[] args) {
		FileOutputStream file;
		try {
			file = new FileOutputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\test.txt");
			file.write(0xb1);
			file.write(0xe8);		//bcd6
			// b9c0e
			file.write(0xbc);
			file.write(0xd6);
			
			file.write(0xb9);
			file.write(0xce);
			
			file.write(0x80);
			file.write('\n');
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// euc-kr 내이름
	// unicode 내이름 utf-8
}
