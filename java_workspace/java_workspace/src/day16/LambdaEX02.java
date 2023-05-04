package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEX02 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨.
		 * 재사용 불가 -> 다른 연산을 하려면 스트림을 다시 생성해야 됨.
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 최종연산 : sum(), forEach(), reduce(계산)
		 * 
		 */
		
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		int[] arr = {1,2,3,4,5}; 
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		OptionalDouble avg =  Arrays.stream(arr).average();   //return이 어떤 것으로 주는지 꼭 확인!
		System.out.println(avg);
		
		//성적배열 a에서 70점이상인 점수만 합계
		int[] a = {50,78,89,54,94,81};
		int sum1 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>=70) {
				sum1 += a[i];
			}
		}
		System.out.println("java로 구현한 sum : "+sum1);
		
		//b의요소는 a의 stream에 담긴 매개변수
		int sum2 = Arrays.stream(a).filter(b->b>=70).sum();    //람다식 형태   //중간연산
		System.out.println("stream으로 구현한 sum : "+sum2);
		
		//List 방법
		//스트림을 생성한 후 70점이상인 점수만 합계
		ArrayList<Integer> grade = new ArrayList<Integer>();
		grade.add(80);
		grade.add(65);
		grade.add(72);
		grade.add(90);
		grade.add(43);
		
		int gradeSum = grade.stream().filter(b->b>=70).mapToInt(n->n.intValue()).sum();
		System.out.println("grade 합계 ; "+gradeSum);
		
		//다른방법
		Stream<Integer> s1 = grade.stream();
		s1.filter(b->b>=70).forEach(System.out::println);
		
		//다른방법
		Stream<Integer> s = grade.stream();
		int sum3 = s.mapToInt(n ->n.intValue()).filter(b->b>=70).sum();
		System.out.println("List 방법 : "+sum3);

	}

}
