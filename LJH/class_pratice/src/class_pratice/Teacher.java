package class_pratice;

public class Teacher extends person {
	
	private String teacherID;
	private int monthSalary;
	private int workedyear;
	
	public String getTeacherID() {
		return teacherID;
	}
	
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	public int getWorkedyear() {
		return workedyear;
	}
	
	public void setWorkedyear(int workedyear) {
		this.workedyear = workedyear;
	}

	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedyear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedyear = workedyear;
	}
	
	
	public void show() {
		System.out.println("------------------------------------------");
		System.out.println("선생이름: " + getName());
		System.out.println("선셍나이: " + getAge());
		System.out.println("선생키: " + getHeight());
		System.out.println("선생몸무게: " + getWeight());
		System.out.println("교직원번호: " + getTeacherID());
		System.out.println("선생월급: " + getMonthSalary());
		System.out.println("선생연차: " + getWorkedyear());
	}
	
	

}
