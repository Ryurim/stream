package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10), 
				new Student("홍길순", 20), 
				new Student("홍길남", 30), 
				new Student("임꺽정", 40), 
				new Student("박문수", 50) 
				);
		
		Stream<Student> stdStream = list.stream();
		IntStream scoreStream = stdStream.mapToInt(std->std.getScore()); //맵에 있는 값을 integer 형으로 바꿔
		double avg = scoreStream.average().getAsDouble();
		System.out.println("avg : " + avg);
		
		//list 에서 직접 avg를 뽑아내자
		//람다식을 이용해 한줄로 끝나는 코드
		double avg2 = list.stream()
				.mapToInt(std->std.getScore())	//합을 가져오고
				.average()	//평균을 내어
				.getAsDouble();	//double 형태로 저장
		System.out.println("avg2 : " + avg2);
 	}

}
