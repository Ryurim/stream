package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		//list가 비어있어서 오류 발생!
//		double avg = list.stream()
//							.mapToInt(Integer::intValue)
//							.average()
//							.getAsDouble();
//		System.out.println("avg : " + avg);
		
		OptionalDouble option1 = list.stream()
										.mapToInt(Integer::intValue)
										.average();
		if (option1.isPresent()) {
			System.out.println("평균 : " + option1.getAsDouble());
		} else {
			System.out.println("평균 : 0.0");
		}
		
//		String[] arrStr = {"a", "bbb", "cccc"};
//		Stream<String> stream1 = Stream.of(arrStr);
//		IntStream stream2 = stream1.mapToInt(s->s.length());
//		//stream2.forEach(a->System.out.println(a)); 귀찮아! 짧게 쓰고 싶어!
//		stream2.forEach(System.out::println); //문자열의 길이 출력 - 메서드 축약
		
		double avg = list.stream()
							.mapToInt(Integer::intValue)
							.average()
							.orElse(0.0);	//없으면 0.0으로 보여주세요
		System.out.println("평균 : " + avg);
		
		list.stream()
				.mapToInt(Integer::intValue)
				.average()
				//.ifPresent(a->System.out.println("ifPresent : " + a)); // 있으면 나오고 없으면 안나와.. 근데 값이 있건 없건 값이 나와주는게 좋아
				.ifPresent(System.out::println); // 축약해서 쓰면 "" + 이런거 못써!
		
	}

}
