package day05;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 =  문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; //일반 자료형처럼 이용가능.
		 */
		String str = "Hello world~!!";
		System.out.println(str);
		
		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("---charAt---");
		System.out.println(str.charAt(0));
		
		//length : 전체 글자의 길이
		System.out.println("--length--");
		System.out.println(str.length());

		//compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("c"));
		
		//concat(str) :이어 붙이기 (+ 연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		System.out.println("--equals--");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		System.out.println("abc" == "abc");   //안되는 경우가 있으니 잘 생각해서 사용하기!-> 정확한 방법은 equals 방법으로 사용하기
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능 , 찾는 문자가 없으면 -1을 반환
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("a"));
		String email = "dhalfks0228@naver.co.kr";
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("."));  //첫발견 위치
		System.out.println(email.lastIndexOf("."));  //끝에서 부터 찾기
		
		//substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0,5)); //시작하는 번호부터 추출함. //두 번째 숫자는 개수이다.(마지막 번호를 포함하지 않는)
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		//trim : 불필요한 공백 삭제
		System.out.println("--trim--");
		System.out.println("         Hello         ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "Java"));  //한글자만 바꿀수도 있고 여러 글자를 바꿀 수도 있음.
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.println(tmp+" ");   //해당 배열을 찍어줌.
		} 
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1+num2;
		System.out.println(sum);
		
		// parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		System.out.println(num3);
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		int sum1 = num3 + num4;
		System.out.println(sum1);
		
		
		
	}

}
