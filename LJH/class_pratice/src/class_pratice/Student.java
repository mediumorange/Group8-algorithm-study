package class_pratice;

public class Student extends person{
	
	private String studentID;
	private int grade;
	private double gpa;
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gpa) {
		
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public void show() {
		System.out.println("------------------------------------------");
		System.out.println("학생이름: " + getName());
		System.out.println("학생나이: " + getAge());
		System.out.println("학생키: " + getHeight());
		System.out.println("학생몸무게: " + getWeight());
		System.out.println("학생id: " + getStudentID());
		System.out.println("학생등급: " + getGrade());
	}

	
	
	
	
	
}
