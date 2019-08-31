import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class Management {
	 static AddOffice object_office[] = new AddOffice[50];
	    static Employee object_employee[] = new Employee[50];
	    static Customer object_customer[] = new Customer[50];
	    static Packet object_package[] = new Packet[50];
	    static int counter_of_office=0;
	    static int counter_of_employee=0;
	    static int count_of_customer=0;
	    static int count_of_package=0;

	    public static void listOffice(){
	        System.out.println("********************************** List Office **********************************");
	        for (int i = 0; i < counter_of_office; i++) {
	            System.out.println("Office name is : " + object_office[i].getOffice_name());
	            System.out.println("Office address is : " + object_office[i].getOffice_address());
	            System.out.println("Office town is : " + object_office[i].getOffice_town());
	            System.out.println("Office city is : " + object_office[i].getOffice_city());
	            System.out.println("Office phone number is : " + object_office[i].getOffice_phone());
	        }
	        System.out.println("");
	    }
	    public static void updateOffice(int office_id,String name,String address,String town, String city,String phone){
	        if(office_id-1>counter_of_office){
	            System.out.println("********************************** Error Message for Update Office **********************************");
	            System.out.println("Wrong id for Office Update ");
	        }
	        else{
	            for (int i = 0; i < counter_of_office; i++) {
	            if(object_office[i].getOffice_ID()==office_id-1){
	                object_office[i].setOffice_name(name);
	                object_office[i].setOffice_address(address);
	                object_office[i].setOffice_town(town);
	                object_office[i].setOffice_city(city);
	                object_office[i].setOffice_phone(phone);
	            }
	        }
	            System.out.println("");
	            
	        }
	        
	        
	    }
	    public static void listCustomer(){
	        System.out.println("********************************** List Customer **********************************");
	        for (int i = 0; i < count_of_customer; i++) {
	            if(object_customer[i].isDelete()==true){
	            System.out.println("Name : " + object_customer[i].getName());
	            System.out.println("Date : " +object_customer[i].getDate());
	            System.out.println("Address : " +object_customer[i].getAddress());
	            System.out.println("City : " +object_customer[i].getCity());
	            System.out.println("Town : " +object_customer[i].getTown());
	            System.out.println("Mail : " +object_customer[i].getMail());
	            System.out.println("Phone : "+object_customer[i].getPhone());
	            
	            }
	            System.out.println("");
	        }
	        System.out.println("");
	        System.out.println("");
	    }  
	    public static void deleteCustomer(int id){
	        if(id-1>count_of_customer){
	            System.out.println("********************************** Error Message for deleting Customer **********************************");;
	            System.out.println("Sorry Not found customer ");
	            System.out.println("");
	        }
	        else{
	             for (int i = 0; i < count_of_customer; i++) {
	             if(object_customer[i].getId()==id-1){
	                object_customer[i].setDelete(false);
	            }
	        
	             }   
	       
	        }
	        System.out.println("");
	        System.out.println("");
	       
	    } 
	    public static void updateCustomer(int id,String name,String birthdate,String gender,String email,String address,String town,String city,String phone){
	        for (int i = 0; i < count_of_customer; i++) {
	            if(id-1==object_customer[i].getId()){
	                object_customer[i].setName(name);
	                object_customer[i].setDate(birthdate);
	                object_customer[i].setGander(gender);
	                object_customer[i].setMail(email);
	                object_customer[i].setAddress(address);
	                object_customer[i].setTown(town);
	                object_customer[i].setCity(city);
	                object_customer[i].setPhone(phone);
	            }
	        }
	    }
	    public static void deleteEmployee(int id_numb){
	         
	         if(id_numb-1 > counter_of_employee){
	             System.out.println(" Sorry not found employee !!!");
	         }  
	         else{
	               for (int i = 0; i < counter_of_employee; i++) {
	                   if(object_employee[i].getId_delete() == id_numb-1){
	                    object_employee[i].setEmployee_delete(false);
	                   }
	               }
	         }  
	     }
	    public static void listEmployee(){
	         System.out.println("********************************** List Employee **********************************");
	         for (int i = 0; i < counter_of_employee; i++) {
	             if(object_employee[i].isEmployee_delete() ==  true){
	                 System.out.println("Type is : " + object_employee[i].getStatus());
	                 System.out.println("Office Id " +object_employee[i].getOfficeID());
	                 System.out.println("Employee's name is : " + object_employee[i].getEmployee_name());
	                 System.out.println("Employee's bithdate is  : " + object_employee[i].getEmployee_birthdate());
	                 System.out.println("Employee's gender is :" +object_employee[i].getEmployee_gender());
	                 System.out.println("Employee's address is :" +object_employee[i].getEmployee_address());
	                 System.out.println("Employee's town is : " + object_employee[i].getEmployee_town());
	                 System.out.println("Employee's city is :" +object_employee[i].getEmployee_city());
	                 System.out.println("Employee's phone number is :" +object_employee[i].getEmployee_phone());
	             }
	             else{
	                 System.out.println("Wrong");
	                 System.out.println("");
	                 break;
	             }
	             System.out.println(); 
	             System.out.println();
	         }
	     }
	    public static void updateEmployee(int id,int office_id,String type ,String name,String birthdate,String gender,String address,String town,String city , String phone){
	        for (int i = 0; i < counter_of_employee; i++) {
	            if(object_employee[i].getId_delete() == id-1){
	                object_employee[i].setOfficeID(office_id-1);
	                object_employee[i].setStatus(type);
	                object_employee[i].setEmployee_name(name);
	                object_employee[i].setEmployee_birthdate(birthdate);
	                object_employee[i].setEmployee_gender(gender);
	                object_employee[i].setEmployee_address(address);
	                object_employee[i].setEmployee_town(town);
	                object_employee[i].setEmployee_city(city);
	                object_employee[i].setEmployee_phone(phone);
	            }
	            if(id-1>counter_of_employee){
	                System.out.println("********************************** Error Message for Update Employee **********************************");
	                System.out.println("Wrong id");
	                System.out.println("");
	                break;
	            }
	        }
	    }
	    public static void listPacket(){
	         System.out.println("********************************** List Packet **********************************");
	         for (int i = 0; i < count_of_package; i++) {
	             System.out.println("Sender Customer : "+object_package[i].getSender_customer());
	             System.out.println("Receiver Customer : " + object_package[i].getReceiver_customer());
	             System.out.println("Packet Cost : " + object_package[i].getCost());
	             System.out.println("Size : " + object_package[i].getVolume());
	             System.out.println("Weight : " + object_package[i].getWeight());
	             System.out.println("Date : " + object_package[i].getDate());
	             System.out.println("");
	         }
	      
	         System.out.println("");
	     }
	    public static void updatePacket(int id_of_packet,int sender_id,int receiver_id,String weight_update,String volume,String date_update){
	          for (int i = 0; i < count_of_package; i++) {
	              if(object_package[i].getPacket_id()==id_of_packet-1){
	                  object_package[i].setSender_customer(sender_id);
	                  object_package[i].setReceiver_customer(receiver_id);
	                  object_package[i].setWeight(weight_update);
	                  object_package[i].setVolume(volume);
	                  object_package[i].setDate(date_update);
	              }
	          }
	      } 
	    public static void deliverPacket(int packet_id,int employee_id){
	         int cost = 0;
	         for (int i = 0; i < count_of_package; i++) {
	             if(object_package[i].getPacket_id()==packet_id-1){
	                 object_package[i].setSituation(1);
	                 cost = object_package[i].getCost();
	             }
	         }
	         for (int i = 0; i < counter_of_employee; i++) {
	             if(object_employee[i].getId_delete()==employee_id-1){
	                 int office_cost  = object_employee[i].getOfficeID()-1;
	                 for (int j = 0; j < counter_of_office; j++) {
	                     if(object_office[j].getOffice_ID()==office_cost){
	                         object_office[j].setTotal_income(cost);
	                     }
	                 }
	             }
	         }
	         
	     }
	    public static void lossPacket(int packet_id,int employee_id){
	           for (int i = 0; i < count_of_package; i++) {
	             if(object_package[i].getPacket_id()==packet_id-1){
	                 object_package[i].setSituation(2);
	             }
	         }
	         for (int i = 0; i < counter_of_employee; i++) {
	             if(object_employee[i].getId_delete()==employee_id-1){
	                 int temp = object_employee[i].getSending();
	                 temp = temp - 1;
	                 object_employee[i].setSending(temp);
	                 if(object_employee[i].getSending() == 3){
	                     object_employee[i].setEmployee_delete(false);
	                     System.out.println(" Employee is fired ");
	                     System.out.println("Employe Name : "+object_employee[i].getEmployee_name());
	                 }
	             }
	         }
	     }
	    public static void trackPacket(int id){
	         System.out.println("********************************** Track Packet **********************************");
	           for (int i = 0; i < count_of_package; i++) {
	             if(object_package[i].getPacket_id()==id-1){
	                 System.out.println("Packet situation number is : "+object_package[i].getSituation());
	                 System.out.println("Cost is : " +object_package[i].getCost());
	                 System.out.println("Volume is : " +object_package[i].getVolume());
	                 System.out.println("Weight is :  : " +object_package[i].getWeight());
	             }
	         }
	           System.out.println("");
	     }
	    public static void increaseSalary(){
	         System.out.println("********************************** Increasing Function  **********************************");
	         for (int i = 0; i < counter_of_employee; i++) {
	             double increase = object_employee[i].getEmployee_salary();
	             increase = increase + (increase/10);
	             object_employee[i].setEmployee_salary(increase);
	         }
	         System.out.println("�ncreasing salaries ...");
	         System.out.println("");
	     }
	    public static void totalIncome(int id_number){
	        System.out.println("********************************** Total �ncome **********************************");
	            for (int i = 0; i < counter_of_office; i++) {
	                if(id_number-1 == object_office[i].getOffice_ID()){
	                     System.out.println("Total income : " + object_office[i].getTotal_income());
	                }        
	        }
	            System.out.println("");
	            
	    }
	    public static void top3customer(){
	        System.out.println("************************* Top 3 Customer *************************");
	        System.out.println("If the customer hasn't sent anything,The customer can't enter the rankings");
	        int[] customer_array = new int[count_of_customer];
	        for (int i = 0; i < count_of_customer; i++) {
	            customer_array[i] = object_customer[i].getCount_of_send();
	        }
	        int temp =0;
	        for(int i=0; i < count_of_customer; i++){  
	                 for(int j=1; j < (count_of_customer-i); j++){  
	                          if(customer_array[j-1] > customer_array[j]){  
	                                 //swap elements  
	                                 temp = customer_array[j-1];  
	                                 customer_array[j-1] = customer_array[j];  
	                                 customer_array[j] = temp;  
	                         }            
	                 }  
	         }
	        int count_three=0;
	        for (int i = 0; i < count_of_customer; i++) {
	            if((object_customer[i].getCount_of_send()== customer_array[count_of_customer-1]  || object_customer[i].getCount_of_send()== customer_array[count_of_customer-2] || object_customer[i].getCount_of_send()== customer_array[count_of_customer-3]) && object_customer[i].getCount_of_send() != 0 && count_three <4){
	                System.out.println(object_customer[i].getName());
	                count_three++;
	            }
	        }
	    }
	    public static String[] search_return(String first_city,String Second_city){
	        String [] array_string = new String[2];
	        for (int i = 0; i < count_of_customer; i++) {
	            if(object_customer[i].getCity().equals(first_city)){
	                array_string[0] = first_city;
	            }
	        }
	        for (int i = 0; i < count_of_customer; i++) {
	            if(object_customer[i].getCity().equals(Second_city)){
	                array_string[1] = Second_city;
	            }
	        }
	        return array_string;
	    }
	    public static void search(String fromCity,String toCity,String status,String min_max_weigh,String volume){

	        if(fromCity.isEmpty() && toCity.isEmpty() && status.isEmpty()&& min_max_weigh.isEmpty() && volume.isEmpty()){
	            System.out.println("************************* Search Results *************************");
	            listPacket();
	        }
	        else if((fromCity.isEmpty() && toCity.isEmpty() && status.isEmpty()&& min_max_weigh.isEmpty() && volume.isEmpty())== false){
	            System.out.println("************************* Search Results *************************");
	            String[] max_min_array = min_max_weigh.split("-");
	            int minimum = Integer.valueOf(max_min_array[0]);
	            int maximum = Integer.valueOf(max_min_array[1]);
	            String[] controll = search_return(fromCity, toCity);
	          
	            if(min_max_weigh.isEmpty()){
	                 for (int i = 0; i < count_of_package; i++) {
	                try {
	                    if((Integer.valueOf(object_package[i].getWeight()) < maximum && Integer.valueOf(object_package[i].getWeight())>minimum && object_package[i].getVolume().equals(volume)) || ((controll[0].equals(fromCity) || controll[0].equals(""))  && (controll[1].equals("") || controll[1].equals(""))) ){
	                    System.out.println("Search Result Packet ID : " + object_package[i].getPacket_id());
	                    System.out.println("Searc Result Receiver Customer : " + object_package[i].getReceiver_customer());
	                        System.out.println("Search Result Sender Customer : " + object_package[i].getSender_customer());
	                        System.out.println("");
	 
	                }
	                    else if (((Integer.valueOf(object_package[i].getWeight()) < maximum ||(Integer.valueOf(object_package[i].getWeight())==null))  || ((Integer.valueOf(object_package[i].getWeight())>minimum) || Integer.valueOf(object_package[i].getWeight())==null)) || ((controll[0].equals(fromCity) || controll[0].equals(""))  || (controll[1].equals("") || controll[1].equals(toCity)))){
	                         System.out.println("Search Result Packet ID : " + object_package[i].getPacket_id());
	                    System.out.println("Searc Result Receiver Customer : " + object_package[i].getReceiver_customer());
	                        System.out.println("Search Result Sender Customer : " + object_package[i].getSender_customer());
	                        System.out.println("");
	                    }
	                   
	                } catch (Exception e) {
	                    System.out.println("Not found search");
	                }
	                
	            }
	            }
	           
	        }
	    }
	     
	    
	    public static void Management() throws FileNotFoundException, IOException{
	        File file = new File ("C:\\Users\\EmirhanBilgeBulut\\Desktop\\odev.txt");
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String st;
	        String spliting [];
	        while (( st = br.readLine()) != null) {
	           spliting = st.split(";");
	           if(spliting[0].equals("addOffice")){
	               AddOffice temp_object = new AddOffice(spliting[1], spliting[2], spliting[3], spliting[4], spliting[5],counter_of_office);
	               object_office[counter_of_office]=temp_object;
	               counter_of_office++;
	           }
	           else if(spliting[0].equals("addEmployee")){
	               Employee temp_object = new Employee(Integer.valueOf(spliting[1]), spliting[2], spliting[3], spliting[4], spliting[5], spliting[6], spliting[7], spliting[8],spliting[9], true,2020.58,0,counter_of_employee);
	               object_employee[counter_of_employee] = temp_object;
	               counter_of_employee++;   
	           }
	           else if(spliting[0].equals("deleteEmployee")){
	               deleteEmployee(Integer.valueOf(spliting[1]));
	           }
	           else if (spliting[0].equals("updateOffice")) {
	                updateOffice(Integer.valueOf(spliting[1]), spliting[2],spliting[3],spliting[4],spliting[5],spliting[6]);
	            }
	           else if (spliting[0].equals("updateEmployee")){
	                updateEmployee(Integer.valueOf(spliting[1]),Integer.valueOf(spliting[2]), spliting[3],spliting[4],spliting[5],spliting[6], spliting[7],spliting[8],spliting[9],spliting[10]);
	           }
	           else if(spliting[0].equals("addCustomer")){
	              Customer temp_object = new Customer(spliting[1], spliting[2], spliting[3], spliting[4], spliting[5], spliting[6], spliting[7],spliting[8],count_of_customer,true,0);
	              object_customer[count_of_customer]=temp_object;
	              count_of_customer++;
	              
	           }
	           else if(spliting[0].equals("listCustomers")){
	               listCustomer();
	           }
	           else if(spliting[0].equals("updateCustomer")){
	               updateCustomer(Integer.valueOf(spliting[1]), spliting[2],spliting[3], spliting[4], spliting[5], spliting[6], spliting[7], spliting[8], spliting[9]);
	           }
	           else if(spliting[0].equals("deleteCustomer")){
	               deleteCustomer(Integer.valueOf(spliting[1]));
	           }
	           else if(spliting[0].equals("listEpmloyees")){
	               listEmployee();
	           }
	           else if(spliting[0].equals("listOffices")){
	               listOffice();
	           }
	           else if(spliting[0].equals("addPacket")){
	               Packet temp_object = new Packet(count_of_package,Integer.valueOf(spliting[1]),Integer.valueOf(spliting[2]),spliting[3],spliting[4],spliting[5]);
	               object_package[count_of_package] = temp_object;
	               count_of_package++;
	                for (int i = 0; i < count_of_customer; i++) {
	                   if(object_customer[i].getId()==Integer.valueOf(spliting[1])){
	                       int number = object_customer[i].getCount_of_send();
	                       number = number+1;
	                       object_customer[i].setCount_of_send(number);
	                   }
	               }
	           }
	           else if(spliting[0].equals("listPackets")){
	               listPacket();
	           }
	           else if(spliting[0].equals("updatePacket")){
	               updatePacket(Integer.valueOf(spliting[1]), Integer.valueOf(spliting[2]), Integer.valueOf(spliting[3]),spliting[4],spliting[5], spliting[6]);
	           }
	           else if(spliting[0].equals("deliverPacket")){
	               deliverPacket(Integer.valueOf(spliting[1]), Integer.valueOf(spliting[2]));
	           }
	           else if(spliting[0].equals("lossPacket")){
	               lossPacket(Integer.valueOf(spliting[1]), Integer.valueOf(spliting[2]));
	           }
	           else if(spliting[0].equals("trackPacket")){
	               trackPacket(Integer.valueOf(spliting[1]));
	           }
	           else if(spliting[0].equals("increaseSalaries")){
	               increaseSalary();
	           }
	           else if(spliting[0].equals("totalIncome")){
	               totalIncome(Integer.valueOf(spliting[1])+1);
	           }
	           else if(spliting[0].equals("top3Customers")){
	               top3customer();
	           }
	         /*  else if(spliting[0].equals("search")){
	                       search(spliting[1], spliting[2], spliting[3], spliting[4], spliting[5]); 
	           }*/
	        }

	    }
}
