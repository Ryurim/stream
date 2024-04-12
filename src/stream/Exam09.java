package stream;

import java.util.Arrays;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//컬렉션 혹은 어레이 객체의 stream을 처리하는데 파이프라인이라는 함수는 중간에 거쳐가는 함수라, 결과를 처리하는 함수를 추가해야 함!
		int[] arrInt = {1, 2, 3, 4, 5};
		int total = Arrays.stream(arrInt)
			.filter(a->a%2==0)
			.peek(n->System.out.println("짝수 : " + n))
			.sum();
		System.out.println("total : " + total);
		
		System.out.println("\n");
		
		Arrays.stream(arrInt)
			.filter(a->a%2 == 0)
			.forEach(n->System.out.println("짝수 : " + n));
	}

}
