package practice.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		// 파일복사 프로그램 짜기
		// 읽은 정보 다른 곳에 넣기
		// - InputStream, OutputStream
		// - read, read([])
		// - write, write([])
		// 한 byte 읽고 한 byte 쓰고 	10M 정도 되는 파일을 복사
		// 버퍼를 이용한 버전			10M 정도 되는 파일을 복사
		
		FileInputStream input;
		FileOutputStream output;
		try {
			input = new FileInputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\1.pptx");
			output = new FileOutputStream("C:\\Users\\solmi\\Documents\\Company\\memo\\1(1).pptx");
			
//			int bytes=0;
//			while((bytes=input.read()) != -1) {
//				output.write(bytes);
//			}
			
			int [] temp = new int[100];
			int i=0;
			while(input.read()!=-1) {
				temp[i]=input.read();
						
			}
			
			output.close();
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
