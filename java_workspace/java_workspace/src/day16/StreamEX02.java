package day16;

import java.util.Arrays;

public class StreamEX02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) .filter().sorted
		 * 중복되는 값은 삭제 .distinct
		 */
		
		int[] arr = {5,6,1,3,5,1,7,8,6,4,2,8,4};
		Arrays.stream(arr)
		.filter(n->n%2==0)
		.sorted()
		.distinct()
		.forEach(System.out::println);
		
		//짝수배열
		int res[] = Arrays.stream(arr).filter(n->n%2==0)
		.distinct().sorted().toArray();
		
		for(int tmp : res) {
			System.out.print(tmp+" ");
		}
		
		
	}

}
