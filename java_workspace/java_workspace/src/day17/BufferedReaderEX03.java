package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.Line;

public class BufferedReaderEX03 {

	public static void main(String[] args) throws IOException {
		/* out.txt파일을 읽어들여 map에 저장 후
		 * 이름 : 점수
		 * 총합계 총인원 출력
		 * Integer.parseInt(문자값);
		 */
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> std = new HashMap<String, Integer>();
		
		while(true) {
			String line = br.readLine();  //홍길동 79
			if(line == null) {break;}  //마지막 라인일 경우 null 입력되면 반복문 빠져나감.

		//홍길동 79 substring(Stringindex=포함, endindex=미포함)
		String name = line.substring(0, line.indexOf(" "));
		//endindex를 적지 않으면 끝까지
		int score =Integer.parseInt(line.substring(line.indexOf(" ")+1));
		std.put(name, score);
		}
		System.out.println(std);  //순서 상관없이 나옴
		int sum=0;
		for(String n : std.keySet()) {
			System.out.println(n+" : "+std.get(n));
			sum+=std.get(n);
		}
		System.out.println("총합계 : "+sum+", 총인원수 : "+std.size());
		
		br.close();

	}

}
