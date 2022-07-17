package class_pratice;

public class Node {
	
	private int x;  // ������ �߿���� �ܺο��� �Ժη� �ٲٰ� �����Ҽ� ������
	private int y; 
	private int string[];
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;  // ���� �������ִ� x�ǰ��� �Ű������� x�� �ٲ���
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;  // ���� �������ִ� y�ǰ��� �Ű������� y�� �ٲ���
	}
	
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX())/2, (this.y + other.getY())/2);
	}

}
