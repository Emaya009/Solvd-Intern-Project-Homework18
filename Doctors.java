package pharmacy.model;

public class Doctors {

    private int doctor_id;
    private int address_id1;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;

    public Doctors() {
    }

    public Doctors(int doctor_id, int address_id1, String first_name, String last_name, String phone, String email) {
        this.doctor_id = doctor_id;
        this.address_id1 = address_id1;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getAddress_id1() {
        return address_id1;
    }

    public void setAddress_id1(int address_id1) {
        this.address_id1 = address_id1;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "doctor_id=" + doctor_id +
                ", address_id1=" + address_id1 +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
