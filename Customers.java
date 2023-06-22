package pharmacy.model;

public class Customers  {
    private int customer_id;

    private int address_id;
    private String first_name;
    private String last_name;
    private String phone;

    public Customers() {
    }

    public Customers(int customer_id, int address_id, String first_name, String last_name, String phone) {
        this.customer_id = customer_id;
        this.address_id = address_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", address_id=" + address_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
