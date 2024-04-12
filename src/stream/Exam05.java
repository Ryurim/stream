package stream;

import java.util.ArrayList;
import java.util.List;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//가격이 > 5000 합계 sql에서 필터링 하는것처럼 수식으로 할 수 있어
		//필터링 : distinct, filter
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("홍길순");
		list.add("홍길남");
		list.add("홍길동"); // 중복 발생!
		list.add("박문수");
		list.add("임꺽정");
		list.add("김구");
		list.add("이산");
		
		//중복요소 제거
		list.stream()
			.distinct()
			.forEach(n->System.out.println("이름 : " + n));
		System.out.println("\n");
		list.stream()
			.filter(n->n.startsWith("홍"))
			.forEach(n->System.out.println("이름 : " + n));
		System.out.println("\n");
		list.stream()
			.filter(n->n.length() < 3)
			.forEach(n->System.out.println("이름 : " + n));
		System.out.println("\n");
	}

	
}
