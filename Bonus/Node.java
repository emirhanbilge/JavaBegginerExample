public class Node {

	int number ;
	Node left = null;
	Node right = null;

	public Node() {


		this.left = null;
		this.right = null;
	}
	public Node(int number) {
		super();
		this.number = number;
		this.left = null;
		this.right = null;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
