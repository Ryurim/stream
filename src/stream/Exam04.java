package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam04 {

	public static int sum = 0; // 전역변수로 해야해
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrStr = {"홍길동", "홍길순", "홍길남", "박문수", "임꺽정"};
		Stream<String> strStream = Arrays.stream(arrStr);
		strStream.forEach(s->System.out.println(s));
		
		//int sum = 0;
		
		IntStream stream = IntStream.rangeClosed(1,100);
		stream.forEach(a->sum+=a);
		System.out.println("sum : " + sum);
	}

}
