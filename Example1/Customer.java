
public class Customer {
    private String name;
    private String date;
    private String gander;
    private String mail;
    private String address;
    private String town;
    private String city;
    private String phone;
    private int id;
    private boolean delete;
    private int count_of_send;

    public class inner_phone{
        public void save_Phone(String phone_number){
            phone = phone_number;
        }
    }
    
    public class alladdresses{
    public void put (String address_name,String town_name,String city_name){
        address=address_name;
        town=town_name;
        city=city_name;
    }
}
    
    public class inner_date{
        public void save_data(String date_time){
            String[] controll_array;
            controll_array = date_time.split("/");
            if(Integer.valueOf(controll_array[2])>2019 || Integer.valueOf(controll_array[1])>12 || Integer.valueOf(controll_array[0])>31){
                System.out.println("Error date");
            }
            else if(Integer.valueOf(controll_array[2])%4 != 0 && Integer.valueOf(controll_array[1])==2 && Integer.valueOf(controll_array[0])>28){
                 System.out.println("Error date");
            }
            else if(Integer.valueOf(controll_array[2])%4==0 &&Integer.valueOf(controll_array[1])==2 && Integer.valueOf(controll_array[0])>29){
                 System.out.println("Error date");
            }
            else if((Integer.valueOf(controll_array[1])==4 || Integer.valueOf(controll_array[1])==6 || Integer.valueOf(controll_array[1])== 9 || Integer.valueOf(controll_array[1])==11 ) && Integer.valueOf(controll_array[0])>30){
            System.out.println("Error date");
        }
            else{
                 date=date_time;
            } 
        }
    }
public alladdresses inner_send=new alladdresses();
public inner_phone inner_phone_object=new inner_phone();
public inner_date inner_date_object=new inner_date();
    public Customer(String name, String date, String gander, String mail, String address, String town, String city, String phone, int id, boolean delete, int count_of_send) {
        this.name = name;
        this.date = "Error Date";
        this.gander = gander;
        this.mail = mail;
        this.address = null;
        this.town = null;
        this.city = null;
        this.phone = null;
        this.id = id;
        this.delete = delete;
        this.count_of_send = count_of_send;
        inner_send.put(address, town, city);
        inner_phone_object.save_Phone(phone);
        inner_date_object.save_data(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public int getCount_of_send() {
        return count_of_send;
    }

    public void setCount_of_send(int count_of_send) {
        this.count_of_send = count_of_send;
    }

    public alladdresses getInner_send() {
        return inner_send;
    }

    public void setInner_send(alladdresses inner_send) {
        this.inner_send = inner_send;
    }

 
}
