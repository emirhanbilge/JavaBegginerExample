
public class Employee {
	  private int id_delete;
	    private int officeID;
	    private String status;
	    private String employee_name;
	    private String employee_birthdate;
	    private String employee_gender;
	    private String employee_address;
	    private String employee_town;
	    private String employee_city;
	    private String employee_phone;
	    private boolean employee_delete;
	    private double employee_salary;
	    private int sending;
	    
	    
	    ///Ýnner class telefon için , inner class ile alýyorum ve daha sonra dýþardaki class'a gönderiyorum
	    public class Save_phone{
	        public void addPhone(String phone){
	            employee_phone = phone;
	        }
	    }
	    
	    ///Tüm adresleri inner class ile alýyorum ve daha sonra dýþardaki class'a gönderiyorum
	    public class AllAddress {

	       
	        public void addAdress(String adresses,String town,String city){
	            employee_address = adresses;
	            employee_city=city;
	            employee_town = town;
	        }
	    }
	    //Inner class'ýn içindeki fonksiyonlara eriþmek için objeler tanýmlýyorum
	    public AllAddress new_object = new AllAddress();
	    public Save_phone save_phone_object = new Save_phone();
	    
	    
	    public Employee(int officeID, String status, String employee_name, String employee_birthdate, String employee_gender, String employee_address, String employee_town, String employee_city, String employee_phone, boolean employee_delete, double employee_salary, int sending, int id_delete) {
	        this.officeID = officeID;
	        this.status = status;
	        this.employee_name = employee_name;
	        this.employee_birthdate = employee_birthdate;
	        this.employee_gender = employee_gender;
	        this.employee_address = employee_address;
	        this.employee_town = employee_town;
	        this.employee_city = employee_city;
	        this.employee_phone = employee_phone;
	        this.employee_delete = employee_delete;
	        this.employee_salary = employee_salary;
	        this.sending = sending;
	        this.id_delete = id_delete;
	        
	    }
	    public Employee(int officeID, String status, String employee_name, String employee_birthdate, String employee_gender, String employee_address, String employee_town, String employee_city, String employee_phone, boolean employee_delete, double employee_salary, int sending) {
	        this.officeID = officeID;
	        this.status = status;
	        this.employee_name = employee_name;
	        this.employee_birthdate = employee_birthdate;
	        this.employee_gender = employee_gender;
	        this.employee_address = null;
	        this.employee_town = null;
	        this.employee_city = null;
	        this.employee_phone = null;
	        this.employee_delete = employee_delete;
	        this.employee_salary = employee_salary;
	        this.sending = sending;
	        ///Inner class vasýtasý ile yolluyorum
	        new_object.addAdress(employee_address,employee_city,employee_town);
	        save_phone_object.addPhone(employee_phone);
	    }

	    public int getOfficeID() {
	        return officeID;
	    }

	    public void setOfficeID(int officeID) {
	        this.officeID = officeID;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getEmployee_name() {
	        return employee_name;
	    }

	    public void setEmployee_name(String employee_name) {
	        this.employee_name = employee_name;
	    }

	    public String getEmployee_birthdate() {
	        return employee_birthdate;
	    }

	    public void setEmployee_birthdate(String employee_birthdate) {
	        this.employee_birthdate = employee_birthdate;
	    }

	    public String getEmployee_gender() {
	        return employee_gender;
	    }

	    public void setEmployee_gender(String employee_gender) {
	        this.employee_gender = employee_gender;
	    }

	    public String getEmployee_address() {
	        return employee_address;
	    }

	    public void setEmployee_address(String employee_address) {
	        this.employee_address = employee_address;
	    }

	    public String getEmployee_town() {
	        return employee_town;
	    }

	    public void setEmployee_town(String employee_town) {
	        this.employee_town = employee_town;
	    }

	    public String getEmployee_city() {
	        return employee_city;
	    }

	    public void setEmployee_city(String employee_city) {
	        this.employee_city = employee_city;
	    }

	    public String getEmployee_phone() {
	        return employee_phone;
	    }

	    public void setEmployee_phone(String employee_phone) {
	        this.employee_phone = employee_phone;
	    }

	    public boolean isEmployee_delete() {
	        return employee_delete;
	    }

	    public void setEmployee_delete(boolean employee_delete) {
	        this.employee_delete = employee_delete;
	    }

	    public double getEmployee_salary() {
	        return employee_salary;
	    }

	    public void setEmployee_salary(double employee_salary) {
	        this.employee_salary = employee_salary;
	    }

	    public int getSending() {
	        return sending;
	    }

	    public void setSending(int sending) {
	        this.sending = sending;
	    }

	    public int getId_delete() {
	        return id_delete;
	    }

	    public void setId_delete(int id_delete) {
	        this.id_delete = id_delete;
	    }
	  
	   
}
