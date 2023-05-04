package day17;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보를 출력.
		//D:\java_workspace\java_workspace\out.txt
		File f = new File("D:\\java_workspace\\java_workspace\\out.txt");
		String fileName = f.getName();
		System.out.println(fileName);  //경로를 제외한 파일이름
		System.out.println(f.getPath());  //파일의 경로+이름
		System.out.println(f.getAbsolutePath());  //경로+이름
		System.out.println(f.getParent());  //파일의 경로
		System.out.println(File.separator);  //파일 구분자 (가장 많이 사용)
		System.out.println(File.separatorChar);  
		
		
		// 시스템에서 직접 알아낸 사용자파일의 경로는 분리
		String fstr = f.toString();
		System.out.println(fstr);  //경로+파일명
		
		// fstr에서 드라이브만 추출 출력
		System.out.println("드라이브명 : "+fstr.substring(0,fstr.indexOf(File.separator)));  //  \\를 입력 \ 하나만 입력하면 읽지 못함.
		
		// fstr에서 파일명만 추출 출력
		System.out.println("파일명 : "+fstr.substring(fstr.lastIndexOf(File.separator)+1));
		
		// fstr에서 파일경로만 추출 출력
		System.out.println("파일 경로 : "+fstr.substring(fstr.indexOf(File.separator)+1, fstr.lastIndexOf(File.separator)));
		
		// 파일명과 확장자 분리
		System.out.println(f.getName());  //파일명.확장자
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명 : "+str[0]+", 확장자 : "+str[1]);
	
		//StringTokenizer 클래스 사용
		StringTokenizer stk = new StringTokenizer(f.getName(),".");
		while(stk.hasMoreElements()) {  //토큰 요소의 값이 있다면 true, 없으면 false 리턴
			System.out.println(stk.nextElement()); 
		}
		
		
	}

}
