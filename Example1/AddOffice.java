
public class AddOffice {
	private String office_name;
    private String office_address;
    private String office_town;
    private String office_city;
    private String office_phone;
    private int office_ID;
    private int total_income;

    public int getTotal_income() {
        return total_income;
    }

    public void setTotal_income(int total_income) {
        this.total_income = total_income;
    }
    
    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getOffice_address() {
        return office_address;
    }

    public void setOffice_address(String office_address) {
        this.office_address = office_address;
    }

    public String getOffice_town() {
        return office_town;
    }

    public void setOffice_town(String office_town) {
        this.office_town = office_town;
    }

    public String getOffice_city() {
        return office_city;
    }

    public void setOffice_city(String office_city) {
        this.office_city = office_city;
    }

    public String getOffice_phone() {
        return office_phone;
    }

    public void setOffice_phone(String office_phone) {
        this.office_phone = office_phone;
    }

    public int getOffice_ID() {
        return office_ID;
    }

    public void setOffice_ID(int office_ID) {
        this.office_ID = office_ID;
    }

    public AddOffice(String office_name, String office_address, String office_town, String office_city, String office_phone, int office_ID) {
        this.office_name = office_name;
        this.office_address = office_address;
        this.office_town = office_town;
        this.office_city = office_city;
        this.office_phone = office_phone;
        this.office_ID = office_ID;
        this.total_income=0;
    }
}
