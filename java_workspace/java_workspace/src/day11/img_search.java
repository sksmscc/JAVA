package day11;

import java.io.File;
import java.util.Scanner;

public class img_search {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * String 배열 5개 생성하고 받은 후
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
		 * 
		 * --이미지 파일--
		 * String.jpg 
		 * method.png
		 */

/*		String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
		String[] img = {"jpg", "png", "gif", "jpeg"};
		int cnt = 0;

		System.out.println("5개의 파일명을 입력해 주세요.");
		for(int i=0; i<fileName.length; i++) {
			fileName[i] = scan.next();
		}
		
			System.out.println("이미지 파일을 검색합니다.");
			for(String tmp : fileName) {
				for(String tmp1 : img) {
					if(tmp.contains(tmp1)) {
						System.out.println(tmp);
						cnt++;
					}	
				}
			}
			
			if(cnt == 0) {
				System.out.println("이미지파일이 없습니다.");
			}
			
			scan.close();
			*/
		
        System.out.println("----------------선생님 정답>> ");
 		Scanner scan = new Scanner(System.in);
 		String[] fileName = new String[5];
  		System.out.println("파일명 5개를 입력해 주세요");
     	for(int i=0; i<fileName.length;i++) {
 			 fileName[i] = scan.next();
 		}
			
//			String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
			//파일명에서 확장자만 분리
//			String search = fileName[0].substring(fileName[0].indexOf(".")+1);
//			System.out.println(search);
			String[] img = {"jpg", "png", "gif", "jpeg"};
			
			
			for(String tmpFile : fileName) {
				String search = tmpFile.substring(tmpFile.indexOf(".")+1);
				if(isContains(img,search)) {
					System.out.println(tmpFile);
				}
			}
			

	}
	//isConatains(String arr[]), String search)
	//기능 : 배열에서 찾는 문자열이 있는지 체크 있으면 true
	public static boolean isContains(String arr[], String search) {
		//배열이 없는 경우
		if(arr==null ||arr.length==0) {
			return false;
		}
		//검색어가 없는 경우
		if(search == null) {
			return false;
		}
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
		
	}

}




