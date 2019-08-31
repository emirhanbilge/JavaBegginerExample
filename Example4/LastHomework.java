import java.util.Random;
import java.util.Scanner;

public class Example4 {

	public static int Controll_book(SingleLinkedList SLL){
		for (int i = 1; i < 7; i++) {
			if(SLL.search_count(i) >3){
				System.out.println("REMOVED " + i +" "+ i +" " + i +" " + i);
				SLL.remove(i);
				SLL.remove(i);
				SLL.remove(i);
				SLL.remove(i);
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {

		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean player_computer = true;
		int player_book = 0;
		int computer_book = 0;
		int Step_number = 1;
		int add_number = -1;
		int user_input =0;
		SingleLinkedList Table = new SingleLinkedList(); 
		SingleLinkedList Player = new SingleLinkedList();
		SingleLinkedList Computer = new SingleLinkedList();
		for (int i = 1; i < 7; i++) {
			Table.add(i);
			Table.add(i);
			Table.add(i);
			Table.add(i);
		}   
		for (int i = 0; i < 7; i++) {
			int temp_num = generator.nextInt(Table.size())+1;
			add_number = (int) Table.get_object_index(temp_num);
			Player.add(add_number);
			temp_num = generator.nextInt(Table.size())+1;
			add_number = (int) Table.get_object_index(temp_num);
			Computer.add(add_number);
		}
		System.out.println("Player   : " + Player.display());
		System.out.println("Computer : " + Computer.display());
		System.out.println("Table    : " + Table.display());
		while(Player.size()>0 && Computer.size()>0 && Table.size()>0){
			System.out.println("********************************* " + Step_number + " *********************************" );
			computer_book = Controll_book(Computer) + computer_book;
			player_book = player_book + Controll_book(Player);
			if(player_computer == true){
				System.out.print("You ask ");
				try {
					user_input   = scanner.nextInt();
					if(user_input>6 || user_input<1) {
						System.out.println("Wrong input , you must write true number !!!");
					}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Wrong INPUT ERROR MESSAGE");
					System.out.println("");
					scanner.next();
				}
				if(Computer.search(user_input) != false && Player.search(user_input) != false){
					while (Computer.search(user_input)) {
						int temp = (int) Computer.remove(user_input);
						Player.add(temp);
					}
				}
				else{
					System.out.println("Computer says Go Fish");
					int random_num = generator.nextInt(Table.size())+1;
					int table_random = (int) Table.get_object_index(random_num);
					System.out.println("You took the card from the table : " + table_random);
					Player.add(table_random);
					player_computer = false;
				} 
			}
			else{
				System.out.print("Computer ask ");
				user_input = generator.nextInt(6)+1;
				System.out.print(" "+ user_input + "\n");
				if(Player.search(user_input) != false && Computer.search(user_input) != false){
					while(Player.search(user_input)){
						int temp = (int) Player.remove(user_input);
						Computer.add(temp);
					}
				}
				else{
					System.out.println("Player says Go Fish");
					int random_num = generator.nextInt(Table.size())+1;
					int table_random = (int) Table.get_object_index(random_num);
					System.out.println("You took the card from the table : " + table_random);
					Computer.add(table_random);
					player_computer = true;
				} 
			}
			computer_book = Controll_book(Computer) + computer_book;
			player_book = player_book + Controll_book(Player);
			System.out.println("Player   : " + Player.display());
			System.out.println("Computer : " + Computer.display());
			System.out.println("Table    : " + Table.display());
			System.out.println("Player Book : " + player_book);
			System.out.println("Computer Book : " + computer_book);
			System.out.println("\n");
			Step_number++;
		}
		System.out.println("Game over !!!");
		if(player_book == computer_book) {
			System.out.println("Equal Score");
		}
		else if(player_book > computer_book) {
			System.out.println("Player win ");
		}
		else {
			System.out.println("Computer is win ");
		}
	}
}
