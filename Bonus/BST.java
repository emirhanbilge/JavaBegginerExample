public class BST {

	Node root = null;

	public BST(Node root) {
		super();
		this.root = root;
	}

	public BST() {
		super();
	}
	
	public void add(int add_data , Node recursive) {
		if(recursive == null) {
			Node new_node = new Node(add_data);
			this.root = new_node;
			System.out.println("Root : " + add_data);
		} 
		else {
			if(recursive.getNumber() < add_data && recursive.getRight() != null) {
				System.out.println("Gidildi saðdan , " + recursive.getNumber());
				add(add_data, recursive.getRight());
			}
			else if(recursive.getNumber() > add_data && recursive.getLeft() != null){
				System.out.println("Gidildi soldan , " + recursive.getNumber());
				add(add_data, recursive.getLeft());
			}
			else {
				Node new_node = new Node(add_data);
				System.out.println(recursive.getNumber() +" buraya gidildi ");
				if(recursive.getNumber() < add_data && recursive.getRight() == null) {
					System.out.println("Eklendi saða " + add_data);
					recursive.setRight(new_node);
				}
				else if(recursive.getNumber() > add_data && recursive.getLeft() == null){
					System.out.println("Eklendi sola "+ add_data);
					recursive.setLeft(new_node);
				}
				
			}
		}
		
	}
	
}
