public class CircularQueue {
	 private int rear , front;
	    private Object[] elements;

	    public CircularQueue(int capacity) {
	        elements = new Object[capacity];
	        rear = -1;
	        front = 0;
	    }
	    
	    void Enqueue(Object  data)
		 {
	             if(isFull()){
	                 System.out.println("Queue overflow");
	             }
	             else{
	                 rear = (rear+1)% elements.length;
	                 elements[rear] = data;
	             }  
		 }
	    
	    Object dequeue() 
	      {
	          if(isEmpty()){
	              System.out.println("Queue is empty");
	              return null;
	          }
	          else{
	              Object retData = elements[front];
	              elements[front] = null;
	              front = ((front+1) % elements.length);
	              return retData;
	          }
		   }
	    
	    Object  Peek()
	    {
	       if(isEmpty()){
	           System.out.println("Queue is empty");
	           return null;
	       }
	       else{
	    	   Object data = elements[front];
	           return data;
	       }
	    }
	    
	    boolean isEmpty(){
	        if(elements[front]==null){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    
	    boolean isFull(){
	        if(front == (rear+1) % elements.length && elements[front] != null && elements[rear] != null){
	            return true;
	        }
	        else{
	        	return false;
	        }
	    }
	    
	    /// Size fonksyonum normalde rear ve front þeklindeydi fakat uygulama esnasýnda sorun
	    /// çýkardýðý için bu þekilde sýfýrdan yazdým. Daha sonradan düzelttim hatayý onu da yorum olarak buraya ekliyorum.
	    
	    /* Ilk kullandýðým size 
	     * 
	     * public int size(){
	     * 			if(rear>=front){ return rear-front+1;}
	     * 			
	     * 			else if(elements[front] != null){return elements.lenght-(front-rear)+1;}
	     * 			
	     * 			else{return 0; }
	     * }
	     * 
	     */
	    
	    ///Þuan ikisi de çalýþmaktadýr ama bu daha hoþuma gittiðinden bunu kullandým.
	    int size(){
	    	int size = 0;
	       for (int i = 0; i < elements.length; i++) {
	    	   if(elements[i] != null) {
				size++;
	    	   }
	       }
	       return size;
	    }
	    
	   
	    
	    /// @author Emirhan Bilge Bulut////
	    /// kolay bir þekilde gönderilen objenin kaç tane olduðunu buldurduðum fonksyon
	    /// Aþaðýdaki fonksiyonu 4 veya daha üstü var mý diye doðrudan çaðýrarak kontrol ettiriyorum.
	    public Object ebb_counter_object(Object input){
	    	int counter = 0 ;
	            for (int i = 0; i <elements.length; i++) {
	                if(elements[i] == input){
	                    counter++;
	                }
	            }
	            return counter;
	        }
	    
	    
	    /// @author Emirhan Bilge Bulut ///
	    /// aþaðýdaki fonksiyonu ise 1-2-3-4-5-6 saðlandý mý kontrol etmek amacý ile yazdým.
	    /// 
	        public int search(int input){
	        	for (int i = 0; i < size(); i++) {
	        		try {
	        			if(input == (int) elements[i] && elements[i] != null){
		                    return (int) 1;
		                }
	        		}
	        		catch (Exception e){	
	            	}
	            }
	            return (int) -1;
	        }
	        
	        
	        ////Display fonksiyonunu burada tanýmlamak istedim ama CLASS BACKGROUND'da da aynýsýný yapabilirdim buradakinin kendi queue class'ýma özel 
	        /// ve her zaman kullanýlabilir olmasýný istedim. 
	        void display() {
	        	for (int i = 0; i < elements.length; i++) {
	        		if(elements[i] != null) {
	        			System.out.print(" " + elements[i] + " ");
	        		}
	        	}
	        }
}
