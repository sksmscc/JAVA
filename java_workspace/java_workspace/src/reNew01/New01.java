package reNew01;

public class New01 {

	public static void main(String[] args) {
		// 홍길동 주민번호 881002-1234567
		// 출력형태 : 생년월일 : 881002 , 성별 : 남자
		
		String pin = "881002-1234567";
		System.out.println(pin);
		
		String result = pin.substring(0,6);
		System.out.println("생년월일 : "+result);
		
		String result2;
		
		if (pin.charAt(7) == '1' || pin.charAt(7) =='3') {
			result2 = "남자";
		}else {
			result2 = "여자";
		}
		System.out.println(pin.charAt(7));  // -1 :
		System.out.println(result2);
		
	}

}
