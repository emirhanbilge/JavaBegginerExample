
public class Stack {
	private int top;
	private Object[]elements;
	Stack(int capacity){
		elements=new Object[capacity];
		top=-1;
	}

	void push(Object data) {
		if(isFull()) {
			System.out.println("Stack overflow");
			
		}
		else {
			top++;
			elements[top]=data;
		}		
	}
        
        ///This is my search function 
        // Search fonkyonununda sadece random atatt�r�rken ve stackten ��karmak i�in 
        // gerekli olan 'var' veya 'yok' anlam�na gelen 1 veya -1 g�nderiyorum.
        Object search(char input){

            int size = size();
            if(isEmpty() == false){  
                for (int i = 0; i <size(); i++) {
                    Object retData = elements[size-1];
                    if((char) retData == input){
                       return 1;
                    }
                    size--;
                }
            }
            else{
                return -1;
            }
            return -1;
        }
      ///////////////////////////////////////////////////////////////////////////////////////  
      
	Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
			
		}
		else {
			Object retData=elements[top];
			top--;
			return retData;
		}
		
	}
	Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			return elements[top];
		}
	}

	 boolean isEmpty() {
		if(top == -1){
                    return true;
                }
                else{
                    return false;
                }
	}

	 boolean isFull() {
		if(elements.length == (top+1)){
                    return true;
                }
                else{
                    return false;
                }
	}
	int size() {
		return top+1;
	}
        
        

}