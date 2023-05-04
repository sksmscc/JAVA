package day15;

public class StringBufferEX {

	public static void main(String[] args) {
		// String 객체 : 문자열을 표현
		// StringBuffer : 문자열을 추가하거나, 변경할 때 주로 사용하는 객체
		// append  : 문자열 추가 끝에 추가
		// insert : 특정 위치에 문자열 추가
		// subString : 문자열 추출
		
		StringBuffer sb = new StringBuffer();  //멀티스레드 환경에서 안전성이 우수
		sb.append("hello");
		sb.append(" ");
		sb.append("java");
		System.out.println(sb.toString());
		
		//다른방법 - ☆메모리 운영상 추천☆
		String result = sb.toString();
		System.out.println(sb);
		
		sb.insert(0, "hi");
		System.out.println(sb.toString());
		System.out.println(sb.substring(0, 4));  //4번지는 포함X
		
		//다른방법 - 메모리가 작을 때는 괜찮지만 메모리가 크면 사용 추천X
		String str = "";
		str += "hello";
		str += " ";
		str += "java";
		System.out.println(str);
		
		StringBuilder sb1 = new StringBuilder();  //성능에서 StringBuilder이 더 좋음.
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("java");
		System.out.println(sb1.toString());
		
		
	}

}
