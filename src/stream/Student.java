package stream;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return this.name;	}
	public int getScore() { return this.score;}
	
	@Override
	public int compareTo(Student o) {
		//여기서 비교하는 필드는 바꿔주면 돼
		return Integer.compare(score, o.score);
	}
}
