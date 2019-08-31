import java.util.Random;
//import java.util.Scanner; Altta adým adým bastýrmayý test amaçlý kullandýðým için import etmiþtim.
/*
 *  @This program was written by Emirhan Bilge Bulut 2017510020
 *  
 */
public class Background {

	///Aþaðýdaki fonksiyon 4 tane ayný olan rakamý çýkarmak için vardýr ve return olarak eklenmesi gereken skoru
	/// döndürmektedir.
	public static int Large_straight_function(CircularQueue player_queues){
        int count_numb = 1;
        boolean flag = true;
        int controll_number = 1;
        while(controll_number<7 ){
            if((int) player_queues.ebb_counter_object((int) controll_number) >=4){
            	flag = false;
            	int size = player_queues.size();
                for (int i = 0; i < size; i++) {
                    int temp = (int) player_queues.Peek();
                    if((temp == controll_number) && count_numb<5){
                    	player_queues.dequeue();
                        count_numb++;    
                    }
                    else{
                      player_queues.Enqueue(player_queues.dequeue());
                    }
                }
            }
            controll_number++;
        }
        if(flag==false) {
        	return 10;
        }
        else {
        	return 0;
        }
	}
	///Aþaðýdaki fonksyon 1-6 çýkarma iþlemi içindir.Return ettirdiði deðer gene skordur.
	public  static int Yahtzee_function(CircularQueue player_queues){
        int win_score = 0;
		boolean controll_flag = true;
        int remove_number = 1;
        for (int i = 1; i < 7; i++) {
            if(player_queues.search(i) !=1){   
               controll_flag = false;
               break;
            }
        }
        if(controll_flag==true){
              while (remove_number < 7) {     
            	  int size = player_queues.size();
                  for (int i = 0; i < size;i++) {
                      if(remove_number == (int) player_queues.Peek()){
                          player_queues.dequeue();
                          remove_number++;
                      }
                      else{
                          player_queues.Enqueue(player_queues.dequeue());
                      }
                  }
            }
             win_score = 20;
        }
        return win_score;
    }
	
	public static void game_function() {
		  Random generator = new Random();
		  ///Scanner scanner = new Scanner(System.in); //Test için enterla adým adým bastýrmak için kullanmýþtým.
		  int player1_score = 0;
		  int player2_score = 0;
		  CircularQueue player1_queue = new CircularQueue(30);
		  CircularQueue player2_queue = new CircularQueue(30);
	        int count = 1;
	        while(count <16 ){
	        	System.out.println("****************************************** Turn : " + count + " ******************************************");
	            
	        	for (int i = 0; i < 3; i++) {
	            	int first = generator.nextInt(6)+1;
	            	int second = generator.nextInt(6)+1;
	            	player1_queue.Enqueue(first);
	            	player2_queue.Enqueue(second);
				}
	            System.out.println();
	            System.out.print("Player 1 : ");
	            player1_queue.display(); 
	            System.out.print("      Score : " + player1_score);
	            System.out.println();
	            System.out.print("Player 2 : ");
	            player2_queue.display();
	            System.out.print("      Score : " + player2_score);
	            System.out.println();
	            player1_score = Yahtzee_function(player1_queue) + player1_score;
	            player2_score = Yahtzee_function(player2_queue) + player2_score;
	            player1_score = Large_straight_function(player1_queue) + player1_score;
	            player2_score = Large_straight_function(player2_queue) + player2_score;
	            System.out.println();
	            System.out.println();
	            ///String enter = scanner.nextLine();   ///Adým adým görmek için enter bilgisi aldýðým yer
	            count++;  
	        }
	        if(player1_score == player2_score) {
	        	System.out.println(" Game Over ");
	        	System.out.println("  Scoreless  ");
	        }
	        else if( player1_score>player2_score) {
	        	System.out.println(" Game Over ");
	        	System.out.println(" The winner is Player 1 ");
	        }
	        else {
	        	System.out.println(" Game Over ");
	        	System.out.println(" The winner is player 2 ");
	        }
	}
}