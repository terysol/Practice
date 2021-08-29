package practice.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class TwoByte {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("aaa")));
			// 콘솔에서 입력받은 것을 file에 계속 저장하기 (Scanner (x)
			// BufferedReader = INputStreamReader(System.in)  --> 읽기
			// file에 쓰기
			
			// 다음주 html, 리눅스 명령어 (기본적인 명 ㅂ령어들 익히기)
			// 백 그라운드 실행 & 
			// | (파이프)
			// find .. | grep .. | tail   --> 아두투
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
