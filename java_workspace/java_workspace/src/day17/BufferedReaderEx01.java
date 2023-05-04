package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader : 문자 보조 스트림
		 * 라인단위로 읽기가 가능
		 * 더 이상 읽을 라인이 없을 경우 null을 리턴
		 * 보조스트림 : 직접 읽고 쓰는 기능이 없음.
		 * 보조스트림을 사용할 경우 생성자에 기반스트림을 매개변수로 포함.
		 */
		BufferedReader br = 
				new BufferedReader(new FileReader("out.txt"));
		while(true) {
			String line = br.readLine();  //한라인씩 읽어들임.
			if(line == null) {
				break;  //반목문 빠져나감.
			}
			System.out.println(line);
		}
		br.close();
		
		System.out.println();
		
		//경로를 포함한 파일명
		BufferedReader br1 = 
				new BufferedReader(new FileReader("C:\\\\Users\\\\EZENIC-156\\\\Downloads\\input.txt"));
		while(true) {
			String line = br1.readLine();  //한라인씩 읽어들임.
			if(line == null) {
				break;  //반목문 빠져나감.
			}
			System.out.println(line);
		}
		br.close();
		
	}	

}
