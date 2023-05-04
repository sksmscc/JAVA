package day16;

import java.util.ArrayList;

public class StreamEX03 {

	public static void main(String[] args) {
		//StreamEX03 stdStream = new StreamEX03();
		//Stream<String> std2 = stdStream.stream();

		ArrayList<Student> std2 = new ArrayList<>();
		std2.add(new Student("홍길동",90));
		std2.add(new Student("강감찬",87));
		std2.add(new Student("홍길순",76));
		std2.add(new Student("강길동",46));
		std2.add(new Student("강길순",67));
		
		//class에 toString 존재하면
		//std2.stream().forEach(System.out::println);
		
		//{} : 처리구문이 많은 경우
		//다른방법
		std2.stream().forEach(s->{  // s => new Student("홍길동",90)
			String name = s.getStudentName();
			int score = s.getStudentscore();
			System.out.println(name+" : "+score);
		});
		
		//합계 => intStream
		//getScore() => Integer => int변환
		//추출 => map, 추출 후 int변환 => mapToInt
		int sum = std2.stream().mapToInt(n->n.getStudentscore()).sum();
		System.out.println("점수 합계 : "+sum);
		
		//개수
		long cnt = std2.stream().count();
		System.out.println("총인원 : "+cnt);
		
		//점수가 70점이상인 친구들의 합계
		System.out.println("--점수가 70점 이상인 학생--");
		int upSum = std2.stream()
		.mapToInt(n->n.getStudentscore())
		.filter(f->f>=70)
		.sum();
		System.out.println(upSum);
	}

}
