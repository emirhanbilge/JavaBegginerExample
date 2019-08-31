public class SingleLinkedList {
	Node head = null;

	public SingleLinkedList(){}

	public SingleLinkedList(Node head) {
		this.head = head;
	}
	public void add(Object input){
		Node inputNode = new Node(input);
		if(head == null){
			head = inputNode;
		}
		else{
			Node temp = head;
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(inputNode);
		}

	}
	public String display(){
		Node temp = head;
		String output ="";
		while(temp!= null){
			output +="|"+ temp.getData() + "|";
			temp = temp.getNext();
		}
		return output;
	}

	public int size(){
		Node temp = head;
		int size_number = 0;
		while(temp!= null){
			size_number ++;
			temp = temp.getNext();
		}
		return size_number;
	}

	public boolean search (Object input){

		Node temp = head;
		while(temp!= null){
			if(temp.getData().equals(input) == true){
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	public Object get_object_index(int index_number){
		int counter_index = 0;
		Node prev = head;
		Node temp = prev.getNext();
		while(counter_index<index_number){

			if(index_number == 1){
				int radikal =(int) head.getData();
				head = head.getNext();
				return radikal;
			}
			if(size()==index_number){
				int radikal = (int) temp.getData();
				prev.setNext(temp.getNext());
				return radikal;
			}
			if(counter_index+1 == index_number){
				int return_data = (int) temp.getData();
				prev.setNext(temp.getNext());
				return return_data;
			}
			counter_index++;
			prev = temp;
			temp = temp.getNext();
		}


		return -1;
	}
	public int search_count(Object searh_object){
		Node temp = head;
		int counter = 0;
		while(temp!= null){
			if(temp.getData().equals(searh_object) == true){
				counter++;
			}
			temp = temp.getNext();
		}
		return counter;
	}

	public Object remove (Object input){
		if(head == null){
			System.out.println("SLL is empty !");
			return null;
		}
		else if ( head.getData().equals(input) == true){
			if(size()==1){
				int radikal = (int) head.getData();
				head=null;
				return  radikal;
			}
			else{
				int radikal = (int) head.getData();
				head = head.getNext();
				return  radikal; 
			}                 
		}
		else{
			Node prev = head;
			Node temp = prev.getNext();

			while(temp!= null){
				if(temp.getData().equals(input)){
					prev.setNext(temp.getNext());
					return temp.getData();
				}
				prev = temp;
				temp = temp.getNext();
			}
			System.out.println("Element could not be found ");
			return null;
		}
	}

}
