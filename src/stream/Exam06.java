package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> sdtList = new ArrayList<>();
		sdtList.add(new Student("홍길동", 85));
		sdtList.add(new Student("홍길순", 95));
		sdtList.add(new Student("홍길남", 75));
		sdtList.add(new Student("박문수", 65));
		sdtList.add(new Student("임꺽정", 100));
		
		sdtList.stream()
			.mapToInt(s->s.getScore())
			.forEach(score->System.out.println("점수 : " + score));
		System.out.println("\n");
		int[] arrInt = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(arrInt);
		intStream.boxed().forEach(obj->System.out.println("obj.intValue : " + obj.intValue()));
		
		
	}
}
