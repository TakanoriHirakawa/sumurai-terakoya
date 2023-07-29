package review.kadai19;

public class Employee implements Comparable<Employee> {
	private int code;
	private String name;
	private String furigana;
	private int age;
	final String FORMAT = "社員番号：  %-3d    社員名：%5s    年齢：%2d";

	public Employee(int code, String name,String furigana, int age) {
		this.code = code;
		this.name = name;
		this.furigana=furigana;
		this.age = age;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int Code) {
		this.code = Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFurigana() {
		return furigana;
	}

	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return String.format(FORMAT, this.getCode(), this.getName(), this.getAge()) + "\n";
	}

	public int compareTo(Employee o) {
		if (o.getCode() < this.getCode()) {
			return 1;
		}
		if (o.getCode() > this.getCode()) {
			return -1;
		}
		return 0;
	}

}
