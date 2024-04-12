package stream;

import java.util.ArrayList;
import java.util.List;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CompareTo 메서드 오버라이드 하지 않고 정렬하는 방법
		
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동", 30));
		list.add(new Student2("홍길순", 10));
		list.add(new Student2("홍길남", 20));
		
		//오름차순 정렬
		list.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s->System.out.println("이름 : " + s.getName() + ", 점수 : " + s.getScore()));
		
		System.out.println("\n");
		
		//내림차순 정렬
		list.stream()
		.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
		.forEach(s->System.out.println("이름 : " + s.getName() + ", 점수 : " + s.getScore()));
	}

}
