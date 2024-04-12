package stream;

public class Student2 {
	private String name;
	private int score;
	private String sex;
	
	public Student2() {}
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public Student2(String name, int score, String sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public String getName() { return this.name;	}
	public int getScore() { return this.score;}
	public String getSex() { return this.sex; };
	
}
