package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEX02 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, printWriter
		 * 파일을 읽어들여 복사하여 객체생성
		 * out.txt에서 파일을 읽어서 => out2.txt로 쓰기
		 */
		
//		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
//		while(true) {
//			String line = br.readLine();
//			if(line == null) {
//				break;
//			}
//			System.out.println(line);
//		}
//		br.close();
//		
//		PrintWriter pw = new PrintWriter(new FileWriter("out2.txt",true));
//		while(true) {
//			String line = br.readLine();
//			if(line==null) {
//				break;
//			}
//			System.out.println(line);
//		}
//		pw.close();
		
	
	BufferedReader br = null;
	BufferedWriter pw = null;  //printWriter을 사용하면 pw.write(line); 로 사용
	
	final String Path_OUT = "out2.txt";
	System.out.println("복사 시작");
	
	br = new BufferedReader(new FileReader("out.txt"));
	pw = new BufferedWriter(new FileWriter(Path_OUT));
	
	System.out.println("복사를 위한 객제 생성 완료");
	
	String line = "";
	
	while((line = br.readLine())!=null) {
		System.out.println(line);
		//pw.write(line);
		pw.write(line+"\r\n");
	}
	System.out.println("텍스트 복사 완료");
	
//	br.close();
//	pw.close();
	if(br != null) {  //객체가 생성되었다면 close()
		br.close();
	}
	if(pw != null) {
		pw.close();
	}
	
	}

}
