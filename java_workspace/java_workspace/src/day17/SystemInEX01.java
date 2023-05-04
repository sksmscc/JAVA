package day17;

import java.io.IOException;

public class SystemInEX01 {

	public static void main(String[] args) {
		/* 알파벳 하나를 쓰고 Enter를 누르면 알파벳을 콘솔에 출력
		 * 
		 */
		System.out.println("알파넷 하나를 쓰고 Enter : ");
		int i1;
		try {
			i1 = System.in.read();
			System.out.println(i1);  //i1이 int이기 때문에 주소 출력
			System.out.println((char)i1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("알파넷 여러개를 쓰고 Enter : ");
		int i2;
		try {
			while((i2=System.in.read()) != '\n') {
				System.out.println((char)i2);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
