package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam14 {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동", 92, "남"));
		list.add(new Student2("홍길순", 82, "여"));
		list.add(new Student2("홍길남", 72, "남"));
		list.add(new Student2("오혜영", 93, "여"));
		
		Map<String, List<Student2>> map = list.stream()
												.collect(
														Collectors.groupingBy(s->s.getSex())
												);
		List<Student2> mList = map.get("남");
		mList.stream().forEach(s->System.out.println("이름 : " + s.getName()));
		
		List<Student2> fList = map.get("여");
		fList.stream().forEach(s->System.out.println("이름 : " + s.getName()));
		
		
		Map<String, Double> map2 = list.stream()
										.collect(
												Collectors.groupingBy(
														s->s.getSex(),
														Collectors.averagingDouble(s->s.getScore())
													)
									 			);
		System.out.println("map2 : " + map2);
		
		
		
		
	}
}
