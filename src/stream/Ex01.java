package stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> std = new HashSet<>();
		std.add("홍길동");
		std.add("임꺽정");
		std.add("신길동");
		std.add("신자바");
		std.add("신기루");
		
		Stream<String> str = std.stream();
		str.forEach(
				n->System.out.println(n) // 이거 굳이 왜 하는거야?? 스프링에서 람다식을 사용하기 때문에 그거 익숙하게 하려고,,
		);
		
		
	}

}
