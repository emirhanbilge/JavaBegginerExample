
public class Packet {
	private int packet_id;
    private int sender_customer;
    private int receiver_customer;
    private String weight;
    private String volume;
    private String Date;
    private int cost;
    private int situation;

    public int getSituation() {
        return situation;
    }
    
    public void setSituation(int situation) {
        this.situation = situation;
    }
    
    public Packet(int packet_id, int sender_customer, int receiver_customer, String weight, String volume, String Date) {
        this.packet_id = packet_id;
        this.sender_customer = sender_customer;
        this.receiver_customer = receiver_customer;
        this.weight = weight;
        this.volume = volume;
        this.Date = Date;
        this.situation = 0;
        if(volume.equals("small")){
            if(Integer.valueOf(weight) <= 5 ){
                this.cost=10;
            }
            else if(Integer.valueOf(weight)<=10 || Integer.valueOf(weight)>=6){
                this.cost = 25;
            }
            else if(Integer.valueOf(weight)>=11){
                this.cost = 45;
            }
        }
        else if(volume.equals("medium")){
             if(Integer.valueOf(weight) <= 5 ){
                this.cost=15;
            }
            else if(Integer.valueOf(weight)<=10 || Integer.valueOf(weight)>=6){
                this.cost = 30;
            }
            else if(Integer.valueOf(weight)>=11){
                this.cost = 50;
            }
        }
         else if(volume.equals("large")){
             if(Integer.valueOf(weight) <= 5 ){
                this.cost=20;
            }
            else if(Integer.valueOf(weight)<=10 || Integer.valueOf(weight)>=6){
                this.cost = 40;
            }
            else if(Integer.valueOf(weight)>=11){
                this.cost = 55;
            }
        }
    }

    public int getPacket_id() {
        return packet_id;
    }

    public void setPacket_id(int packet_id) {
        this.packet_id = packet_id;
    }

    public int getSender_customer() {
        return sender_customer;
    }

    public void setSender_customer(int sender_customer) {
        this.sender_customer = sender_customer;
    }

    public int getReceiver_customer() {
        return receiver_customer;
    }

    public void setReceiver_customer(int receiver_customer) {
        this.receiver_customer = receiver_customer;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
