package day07;

import java.util.Scanner;

public class 과제_Main {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9까지만)
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * 3 5 7
		 * 3 4 6
		 * 1s 
		 * 
		 * 0
		 * 3 5 7
		 * 3 7 8
		 * 1s 1b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * 3 out
		 * 3자리씩 배열로 하기
		 * count도 넣어주기
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해 주세요.(1~9, 3자리) >
		 * 3 5 6
		 * 2s
		 * 3s 다 맞으면 종료(게임횟수출력)
		 */
		
		
		//1. Scanner 열기 
		Scanner scan = new Scanner(System.in);
		
		//2. 변수들을 선언
		int comNum[] = new int[3];      //컴퓨터 배열
		int myNum[] = new int[3];       //내 배열
		int count = 0; //게임횟수 출력용
		
/*		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;   //1~9까지
			 for(int j=0; j<i; j++ ) {
				 if(comNum[i] == comNum[j]) {
					 i--;
					 break;  //for(j의 구문을 빠져나감)
				 }
			 }
		}
		
		
*/
	System.out.println("-----------lotto예제에서 만든 메서드 호출---------------");
	
		//[활용]
		//lotto 예제에서 만든 메서드 호출
		Lotto예제 lotto = new Lotto예제();	
		Lotto예제.randomArray(comNum);  //클래스명만 입력해도 출력 가능.
		lotto.randomArray(comNum);    //다른 방법.
		lotto.printArray(comNum);
		//Point p = new Point(); //Point 클래스의 객체 생성
		//p.print();   //static 메서드가 아니기 때문에 클래스명으로 접근불가.
		
		System.out.println("---------------------------------------------");
		
		
		
		//4. 사용자 숫자 입력받기
		int s=0;        //while문으로 내려와도 상관없음.
		int b=0;        //while문으로 내려와도 상관없음.
		while(true) {
			System.out.println(">>야구게임 시작");
			System.out.println("컴퓨터가 숫자를 결정했습니다. ");
			System.out.println(" > 숫자 입력 :(1~9, 숫자 3개) : ");
			
/*			숫자로 입력 받는 경우
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}
*/
			//값을 문자로 입력받는 경우
			String myStr = scan.next();  // 789 => 한자리씩 잘라서 배열에 저장
			String[] myNumStrArr = myStr.split("");  //한글자씩 잘라서 배열로 저장
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]); //String ->int INteger.paesInt
			}
			 count++;   //카운트 1회 증가
			
			//숫자 비교 조건
			for(int i = 0; i<comNum.length; i++) {  //컴퓨터 NUm 기준 탐색
				for(int j=0; j<myNum.length; j++) { // myNum 기준 탐색
					//스트라이크 기준 조건 (값 & 자리수도 같을 경우)
					if(comNum[i] == myNum[j] &&  i ==j) {   //스트라이크 기준 조건
						s++;
						//ball의 조건(값만 같다면, 자리수는 다른 경우)
					}else if(comNum[i] == myNum[j] && i != j) {
						b++;
					} 
				}
			}
			
			//출력 조건
			//out 조건 (아무것도 안맞을 경우)
			if(s==0 && b==0) {
				System.out.println("OUT!!");	
			} else {
				System.out.println(s+"S "+b+"B");
				System.out.println("시도횟수 : "+count);				
				break;
			}
			
			
			//정답 조건
			if(s==3) { 
				System.out.println("축 정답!!");
				System.out.println("시도횟수  : "+ count);
				break;
			}
		}
	
		
		scan.close();
		

	}

}
