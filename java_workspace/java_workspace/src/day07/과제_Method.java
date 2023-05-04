package day07;

import java.util.Scanner;

public class 과제_Method {

 static Scanner scan = new Scanner(System.in);

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

		

		System.out.println("야구게임 시작~");

	

		int com[] = new int[3];
		int user[] =new int[3];

	
		comNum(com);
	//	printArray(com);

		userNum(user);
		baseball(com,user);

		scan.close();

	}

	

	// 랜덤으로 번호 생성
	public static int randomnum() {
			return(int)(Math.random()*9)+1;
	}

	//숫자 입력
	public static void userNum(int arr[]) {
		System.out.print("세 개의 숫자 입력 : (1~9) ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	}

	

	//게임 시작
	public static void comNum(int arr[]) {
		int i = 0;
		do {
			int random = randomnum();
			if(!check(arr,random)) {
				arr[i] = random;
				i++;
			}
		}while(i < arr.length);
	}

	

	// 같은 값이 들어가지 않도록 
	public static boolean check(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}

	//배열 출력하기
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	

	//결과
	public static void baseball(int com[], int user[]) {
		int cnt = 0;

		while(true) {
			int strike = 0;
			int ball = 0;
			cnt++;
			for(int i=0;i<com.length;i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i]==user[j] && i==j) {
						strike++;		
					}else if(com[i]==user[j]&& i!=j){
						ball++;
				   }
				}
			}

		

	if (strike == 3) {
		System.out.println("정답! ("+cnt+"번째에 맞췄습니다.)");
		break;
	}
	if (strike == 0 && ball == 0) {
		System.out.println("3 out");
	} else {
		System.out.print("스트라이크 : "+strike+"s");
		System.out.println();
		System.out.println("볼 : "+ball+"b");
	}

	System.out.println();
	userNum(user);

		}

    }

}
