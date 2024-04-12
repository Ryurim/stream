package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동", 95, "남"));
		list.add(new Student2("홍길순", 65, "여"));
		list.add(new Student2("홍길남", 25, "남"));
		list.add(new Student2("박문수", 75, "남"));
		list.add(new Student2("임꺽순", 85, "여"));
		
		List<Student2> mList =  list.stream()
									.filter(s->s.getSex().equals("남"))
									.toList();
		mList.stream().forEach(s->System.out.println("남자 : " + s.getName()));
		
		List<Student2> fList =  list.stream()
									.filter(s->s.getSex().equals("여"))
									.toList();
		fList.stream().forEach(s->System.out.println("여자 : " + s.getName()));
		
		Map<String, Integer> map = list.stream()
										.collect(
												Collectors.toMap(	//맵으로 전환
													s->s.getName(),	//키
													s->s.getScore()	//밸류
												)
										);
		System.out.println("map : " + map);
	}

}
