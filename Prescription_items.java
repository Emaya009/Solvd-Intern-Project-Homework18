package pharmacy.model;

public class Prescription_items {
    private int id_num;
    private int prescription_id;
    private int medicine_id;
    private int quantity;

    public Prescription_items() {
    }

    public Prescription_items(int id_num, int prescription_id, int medicine_id, int quantity) {
        this.id_num = id_num;
        this.prescription_id = prescription_id;
        this.medicine_id = medicine_id;
        this.quantity = quantity;
    }

    public int getId_num() {
        return id_num;
    }

    public void setId_num(int id_num) {
        this.id_num = id_num;
    }

    public int getPrescription_id() {
        return prescription_id;
    }

    public void setPrescription_id(int prescription_id) {
        this.prescription_id = prescription_id;
    }

    public int getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(int medicine_id) {
        this.medicine_id = medicine_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Prescription_items{" +
                "id_num=" + id_num +
                ", prescription_id=" + prescription_id +
                ", medicine_id=" + medicine_id +
                ", quantity=" + quantity +
                '}';
    }
}
