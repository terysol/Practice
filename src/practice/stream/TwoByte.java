package practice.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class TwoByte {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("aaa")));
			// �ֿܼ��� �Է¹��� ���� file�� ��� �����ϱ� (Scanner (x)
			// BufferedReader = INputStreamReader(System.in)  --> �б�
			// file�� ����
			
			// ������ html, ������ ��ɾ� (�⺻���� �� ���ɾ�� ������)
			// �� �׶��� ���� & 
			// | (������)
			// find .. | grep .. | tail   --> �Ƶ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
