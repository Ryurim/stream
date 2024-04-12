package stream;

import java.util.Arrays;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		long count = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.count();
		System.out.println("count : " + count );
		
		long sum = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.sum();
		System.out.println("sum : " + sum);
		
		double avg = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.average()
							.getAsDouble();
		System.out.println("avg : " + avg);
		
		int max = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.max()
							.getAsInt();
		System.out.println("max : " + max);
		
		int min = Arrays.stream(arrInt)
				.filter(n->n%2==0)
				.min()
				.getAsInt();
		System.out.println("min : " + min);
		
		int first = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.findFirst()
							.getAsInt();
		System.out.println("first : " + first);
		
		//짝수의 합
		int sum1 = Arrays.stream(arrInt)
							.filter(n->n%2==0)
							.sum();
		System.out.println("짝수 합 : " + sum1);
		
		//홀수의 합
		int sum2 = Arrays.stream(arrInt)
							.filter(n->n%2!=0)
							.sum();
		System.out.println("홀수 합 : " + sum2);
	}

}
