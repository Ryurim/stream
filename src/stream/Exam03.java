package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			Product product = new Product(i, "상품 " + i, "우리회사", (int)(Math.random()*10000));
			list.add(product);
		}
		Stream<Product> str = list.stream();
		
		//중간값 처리
		str.forEach(p->System.out.println(p));
		
		list.stream().forEach(p->System.out.println(p));
	
		System.out.println("\n");
		
		String[] arrStr = {"홍길동", "홍길순", "홍길남", "박문수", "임꺽정"};
		Stream<String> strStream = Arrays.stream(arrStr);
		strStream.forEach(s->System.out.println(s));
	}

}
