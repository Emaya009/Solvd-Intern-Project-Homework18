package pharmacy.model;

public class Addresses {

    private int address_id;
    private String street_name;
    private String city;
    private String state;
    private String country;

    public Addresses() {
    }
    public Addresses(int address_id, String street_name, String city, String state, String country) {
        this.address_id = address_id;
        this.street_name = street_name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "address_id=" + address_id +
                ", street_name='" + street_name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
