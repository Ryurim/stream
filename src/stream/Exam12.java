package stream;

import java.util.Arrays;
import java.util.List;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 92),
				new Student("홍길순", 85),
				new Student("홍길남", 88)
				);
		
		int sum1 = list.stream()
						.mapToInt(Student::getScore)
						.sum();	//객체가 없으면 에러 발생!
		int sum2 = list.stream()
					.mapToInt(Student::getScore)
					.reduce(0, (a, b) -> a+b);	//객체가 없어도 에러 발생 안함! default로 0을 준거라서
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);

	}

}
