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
		System.out.println("�����̸�: " + getName());
		System.out.println("���ĳ���: " + getAge());
		System.out.println("����Ű: " + getHeight());
		System.out.println("����������: " + getWeight());
		System.out.println("��������ȣ: " + getTeacherID());
		System.out.println("��������: " + getMonthSalary());
		System.out.println("��������: " + getWorkedyear());
	}
	
	

}
