package pharmacy.model;

import org.w3c.dom.Text;

import java.util.Date;

public class Medicine_orders {
    private int order_id;
    private Date order_date;
    private Date pay_date;
    private int customer_id;
    private int med_id;
    private int payment_mode;
    private double amount_paid;
    private double discount;
    private String status;
    private Text comment;
    private String invoiceno;

    public Medicine_orders() {
    }

    public Medicine_orders(int order_id, Date order_date, Date pay_date, int customer_id, int med_id, int payment_mode, double amount_paid, double discount, String status, Text comment, String invoiceno) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.pay_date = pay_date;
        this.customer_id = customer_id;
        this.med_id = med_id;
        this.payment_mode = payment_mode;
        this.amount_paid = amount_paid;
        this.discount = discount;
        this.status = status;
        this.comment = comment;
        this.invoiceno = invoiceno;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public int getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(int payment_mode) {
        this.payment_mode = payment_mode;
    }

    public double getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(double amount_paid) {
        this.amount_paid = amount_paid;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Text getComment() {
        return comment;
    }

    public void setComment(Text comment) {
        this.comment = comment;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    @Override
    public String toString() {
        return "Medicine_orders{" +
                "order_id=" + order_id +
                ", order_date=" + order_date +
                ", pay_date=" + pay_date +
                ", customer_id=" + customer_id +
                ", med_id=" + med_id +
                ", payment_mode=" + payment_mode +
                ", amount_paid=" + amount_paid +
                ", discount=" + discount +
                ", status='" + status + '\'' +
                ", comment=" + comment +
                ", invoiceno='" + invoiceno + '\'' +
                '}';
    }
}
