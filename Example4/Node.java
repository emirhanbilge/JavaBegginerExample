public class Node {
	Object data = null;
	Node next = null;

	public Node(){	
	}
	public Node(Object data){
		this.data = data;
	}
	public Node(Object data,Node node){
		this.data = data;
		this.next = node;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}deneme2
