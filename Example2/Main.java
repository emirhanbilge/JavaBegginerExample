
import java.util.Random;
import java.util.Scanner;

/**
*
* @author EmirhanBilgeBulut
*/



public class Main {

	  
    //// Birinci �inko ve ikinci �inko olma durumlar� ayr� ayr� oyuncular i�in ge�erli olarak kabul edilmi�tir.
    /// �inkolar i�in para payla��m� gibi bir kural belirtilmedi�inden 2 oyuncunun �inko durumu ayr� ayr� ele al�nm��t�r.
    
    
    public static void controll_function(Stack A_N_Letters_for_player_1,Stack A_N_Letter_for_player_2,Stack O_Z_Letters_for_player_1,Stack O_Z_Letters_for_player_2,Stack temp_A_to_N,Stack temp_O_to_Z,Stack bag2,char random_letter,Stack bag1_display,Stack bag1_temp,int count,int cinko,int cinko2){

        System.out.println("******************************** " + count + " ********************************");
              System.out.println("");
              System.out.println("Selected Letter :" + random_letter);
              System.out.println("");
              
            if((int)A_N_Letters_for_player_1.search(random_letter) != -1  || (int)A_N_Letter_for_player_2.search(random_letter)!= -1){
                delete_letter_or_letters(A_N_Letters_for_player_1, temp_A_to_N, random_letter);
                delete_letter_or_letters(A_N_Letter_for_player_2, temp_A_to_N, random_letter);
            }
            else if((int)O_Z_Letters_for_player_1.search(random_letter) != -1 || (int)O_Z_Letters_for_player_2.search(random_letter) != -1){
                delete_letter_or_letters(O_Z_Letters_for_player_1, temp_O_to_Z, random_letter);
                delete_letter_or_letters(O_Z_Letters_for_player_2, temp_O_to_Z, random_letter);

            }    
            System.out.println("BAG 1 :");
            display_function_for_bags(bag1_display,bag1_temp);
            if(bag2.isEmpty()==true){
                System.out.println("BAG 2 : ");
            }
            else{
                System.out.println("BAG 2 : ");
                display_function_for_bags(bag2, bag1_temp);
            }
            System.out.println("Player 1 : ");
            display_letter_or_letters_for_players(A_N_Letters_for_player_1,O_Z_Letters_for_player_1,temp_A_to_N,temp_O_to_Z);
            System.out.println("Player 2 : ");
            display_letter_or_letters_for_players(A_N_Letter_for_player_2, O_Z_Letters_for_player_2, temp_A_to_N, temp_O_to_Z);
            System.out.println("************************************************************************************************");
            System.out.println(" \n ");
    }
    public static void delete_letter_or_letters(Stack four_letters,Stack temp_stack,char random_letter){
        
        int first_size = four_letters.size();
        for (int i = 0; i < first_size; i++) {
            char temp = (char) four_letters.pop();
            if(temp == random_letter){
            }
            else{
                temp_stack.push(temp);
            }
        }
        int tem_size = temp_stack.size();
        for (int i = 0; i < tem_size; i++) {
            char temp_add = (char) temp_stack.pop();
            four_letters.push(temp_add);
        }
    }
   public static void display_letter_or_letters_for_players(Stack first_part,Stack second_part,Stack first_temp,Stack second_temp){
       
       
      int long_stack_1 = first_part.size();
      int long_stack_2 = second_part.size();
       for (int i = 0; i < long_stack_1; i++) {
           char temp_letter = (char) first_part.pop();
           System.out.print("|" + temp_letter + "|" );
           first_temp.push(temp_letter);
       }
       for (int i = 0; i < long_stack_2; i++) {
           char temp_letter_second = (char) second_part.pop();
           System.out.print("|"+temp_letter_second + "|");
           second_temp.push(temp_letter_second);
       }
       for (int i = 0; i < long_stack_1; i++) {
           char temp_letter = (char) first_temp.pop();
           first_part.push(temp_letter);
       }
       for (int i = 0; i < long_stack_2; i++) {
            char temp_letter_second = (char) second_temp.pop();
             second_part.push(temp_letter_second);
       }
       System.out.println("");
   }
   
   public static void display_function_for_bags(Stack first,Stack second){
       /// Alfabedeki harflerin bast�r�lmas� i�in
       int long_stack = first.size();
       for (int i = 0; i < long_stack; i++) {
            char temp_letter = (char) first.pop();
            System.out.print("|"+temp_letter+"|");
            second.push(temp_letter);
        }
       int long_stack_2 = second.size();
        for (int i = 0; i < long_stack_2; i++) {
            char temp_letter = (char) second.pop();
            first.push(temp_letter);
        }
        System.out.println("");
   }

	public static void main(String[] args) {
		
		 Random generator = new Random();  ///Random olu�turmak i�in random tan�mlamam en ba�ta 
	     Stack A_N_Letters_for_player_1 = new Stack(4);
	     Stack O_Z_Letters_for_player_1 = new Stack(4);
	     
	     Stack A_N_Letter_for_player_2 = new Stack(4);
	     Stack O_Z_Letters_for_player_2=new Stack(4);
	     
	     Stack temp_A_to_N = new Stack(4);
	     Stack temp_O_to_Z = new Stack(4);

	     int counter_random_letter=0;
	     
	     Stack bag1 = new  Stack(26);
	     Stack bag2 = new Stack(26);
	     
	     Stack bag_temp = new Stack(26);
	     
	    ///Random 4 tane harfin gelmesini player 1 i�in alttaki �ekilde yapt�m
	    while(counter_random_letter<4){
	         int random_first_for_four_letter = generator.nextInt(14) + 65; //65-90 aras� ascii tablosunda A_N aral���
	         int random_second_for_four_letter= generator.nextInt(12) + 79; //65 aras� ascii tablosunda O_Z aral���
	           if( ((int)A_N_Letters_for_player_1.search((char) random_first_for_four_letter) == -1 && (int)O_Z_Letters_for_player_1.search((char) random_second_for_four_letter) == -1)){
	             A_N_Letters_for_player_1.push((char) random_first_for_four_letter);   
	             O_Z_Letters_for_player_1.push((char) random_second_for_four_letter);
	             counter_random_letter++;
	         }
	     }
	    /////////////////////Player 1 i�in random 4 + 4 harf gelmesinin bitti�i yer
	    
	    
	    
	    counter_random_letter=0;///tek bir counter� defalarca kullan�yorum yukarda artan counter� s�f�rlamam laz�m.Player 2 i�in tekrardan random atat�cam
	     
	     
	     ////////////Player 2 i�in random 4+4 harf atama ba�lang�c�
	     while(counter_random_letter<4){
	         int random_first_for_four_letter = generator.nextInt(14) + 65; //65-90 aras� asci tablosunda A_N aral���
	         int random_second_for_four_letter= generator.nextInt(12) + 79; //65 aras� asci tablosunda O_Z aral���
	           if( ((int)A_N_Letter_for_player_2.search((char) random_first_for_four_letter) == -1 &&(int) O_Z_Letters_for_player_2.search((char) random_second_for_four_letter) == -1)){
	             A_N_Letter_for_player_2.push((char) random_first_for_four_letter);   
	             O_Z_Letters_for_player_2.push((char) random_second_for_four_letter);
	             counter_random_letter++;
	         }
	     }   
	     
	     ///////////Player 2'nin random atamas�n�n bitti�i yer
	     
	     
	     
	     
	     counter_random_letter = 25;/////Counter'� 25 yapma sebebim alfabeyi bag1'e eklicek olmam 
	     
	     while (counter_random_letter>-1){///Alfabeyi ekledi�im yer 
	         bag1.push((char) (65+counter_random_letter )); /// eksiltme sebebim stack'e eklerken ters olmamas� i�in
	         counter_random_letter--;
	     }
	     
	     ///�lk ba�ta bag1 i Player1'i ve Player2'yi bast�rd���m yer
	        System.out.println("BAG 1 :");
	        display_function_for_bags(bag1,bag_temp);
	        System.out.println("Player 1 : ");
	        display_letter_or_letters_for_players(A_N_Letters_for_player_1,O_Z_Letters_for_player_1,temp_A_to_N,temp_O_to_Z);
	        System.out.println("Player 2 : ");
	        display_letter_or_letters_for_players(A_N_Letter_for_player_2, O_Z_Letters_for_player_2, temp_A_to_N, temp_O_to_Z);
	    /////Ekrana ilk ��kt�n�n do�ru oldu�unu g�stermek i�in var    
	        
	        
	        int count = 1;  //Raundlar� g�stermek i�in
	        
	        int cinko_for_player1 = 0;///�inko olursa ekrana s�rekli bast�rmamas� i�in count tuttum.(Playe 1)
	        int cinko_for_player2 = 0;//�inko olursa ekrana s�rekli bast�rmamas� i�in count tuttum. (Player 2)
	       
	        
	        //Scanner scanner = new Scanner(System.in);//enter ile ad�m ad�m gitsin diye input almak i�in
	       
	        
	        ////A�a��daki while ile s�rekli random harf atatt�r�yorum �artlar sa�lanana kadar
	        while( ((A_N_Letter_for_player_2.isEmpty() == false) || (O_Z_Letters_for_player_2.isEmpty() == false)) && ((A_N_Letters_for_player_1.isEmpty() == false) || (O_Z_Letters_for_player_1.isEmpty() == false))){
	          
	            int random_letter_in_alphabet = generator.nextInt(26) + 65; ///Alfabeden random harf i�in
	          
	            if( (A_N_Letters_for_player_1.isEmpty() || O_Z_Letters_for_player_1.isEmpty())  && cinko_for_player1<1 ){//Player 1 �inko olma durumu bast�rmas�
	                System.out.println("Player 1 : ");
	                System.out.println("Birinci �inko 10$");
	                cinko_for_player1++;
	            }
	       
	            if((A_N_Letter_for_player_2.isEmpty() || O_Z_Letters_for_player_2.isEmpty())  && cinko_for_player2<1){//Player 2 i�in �inko olma durumu bast�rma
	                
	                System.out.println("Player 2 : ");
	                System.out.println("Birinci �inko 10$");
	                cinko_for_player2++;
	            }
	                
	            if((int) bag2.search((char)random_letter_in_alphabet) == -1){       ////Gelen randomlar bazen ayn� denk gelebilir ve gelen random bag2'ye ekleniyor.
	                                                                                ////Buradaki amac�m bag2'de yok ise o random ge�erlidir demek istedim ve daha sonra 
	                char random_letter = (char) random_letter_in_alphabet;          ////onlar� var m� yok mu diye stack kontrol�ne yollad�m.
	                 
	                //Gelen random harfi bag2'ye yollama                           ////Bag2'yi kontrol etme sebebim �rne�in ba�lang��ta 'A' harfi geldi ve 10 defa 
	                bag2.push(random_letter);                                     ////daha d�nd�kten sonra yeniden 'A' denk gelirse bag2'de oldu�undan yeni random atan�cak.
	                
	                ///Enter ile bekleme
	                ///scanner.nextLine();
	                
	                ///A�a��daki fonksyon ile 2 oyuncu i�inde kontrolleri ve sildirmeleri yap�yorum
	                controll_function(A_N_Letters_for_player_1, A_N_Letter_for_player_2, O_Z_Letters_for_player_1, O_Z_Letters_for_player_2, temp_A_to_N, temp_O_to_Z, bag2, random_letter, bag1, bag_temp,count,cinko_for_player1,cinko_for_player2);
	                    
	                count++; ///round i�in countu artt�r�yorum
	                     
	                delete_letter_or_letters(bag1, bag_temp, (char) random_letter_in_alphabet);///bag1'den ��karmak i�in gelen harfi
	                
	            }
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        if( (A_N_Letter_for_player_2.isEmpty() == true && O_Z_Letters_for_player_2.isEmpty() == true) && (A_N_Letters_for_player_1.isEmpty() ==true && O_Z_Letters_for_player_1.isEmpty() == true)){
	             System.out.println("Player 1 won 25 $              Player 2 won 25 $");
	        }
	        else if( (A_N_Letters_for_player_1.isEmpty() ==true && O_Z_Letters_for_player_1.isEmpty() == true) ){
	                System.out.println("Player 1 Won");
	                System.out.println("You won 40 $");
	                 }
	        else if( A_N_Letter_for_player_2.isEmpty() == true && O_Z_Letters_for_player_2.isEmpty() == true){
	                System.out.println("Player 2 Won");
	                System.out.println("You won 40 $");
	            }
	    
	}

}
