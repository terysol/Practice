package practice.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Unicode {
	public static void main(String[] args) {
		// AE40
		// c194
		// bbfc
		FileOutputStream file;
		try {
			file = new FileOutputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\unicode.txt");
			file.write(234);
			file.write(185);
			file.write(128);
			
			file.write(236);
			file.write(134);
			file.write(148);
			
			file.write(235);
			file.write(175);
			file.write(188);
			file.write('\n');
			
			// InputStream / OutputStream
			// - String.getBytes()
			// - new String(charset);
			
			// InputStreamReader / OutputStreamWriter
			// - read()
			// - write()
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
