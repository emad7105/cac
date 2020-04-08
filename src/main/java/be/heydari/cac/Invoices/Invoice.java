package be.heydari.cac.Invoices;

import be.heydari.cac.commons.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Objects;


/**
 * @author Emad Heydari Beni
 */
@Document
public class Invoice extends AbstractDocument {

    private String desc;
    private String customer;
    private String amount;
    private Byte[] content;

    public Invoice() {
    }

    public Invoice(String desc, String customer, String amount, Byte[] content) {
        this.desc = desc;
        this.customer = customer;
        this.amount = amount;
        this.content = content;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(desc, invoice.desc) &&
                Objects.equals(customer, invoice.customer) &&
                Objects.equals(amount, invoice.amount) &&
                Arrays.equals(content, invoice.content);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), desc, customer, amount);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "desc='" + desc + '\'' +
                ", customer='" + customer + '\'' +
                ", amount='" + amount + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}
