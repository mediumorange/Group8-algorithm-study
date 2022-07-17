package class_pratice;

public class Node {
	
	private int x;  // 보안을 중요시함 외부에서 함부로 바꾸고 접근할수 없게함
	private int y; 
	private int string[];
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;  // 내가 가지고있는 x의값을 매개변수의 x로 바꿔줌
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;  // 내가 가지고있는 y의값을 매개변수의 y로 바꿔줌
	}
	
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX())/2, (this.y + other.getY())/2);
	}

}
