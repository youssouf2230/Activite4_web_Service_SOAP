package ws;
import java.time.LocalDate;
import java.util.Date;

public class Compte {
    private int code;
    private double sold;
    private Date dateCreation;
    public Compte() {}
    public Compte(int code, double sold,Date date) {
        this.code = code;
        this.sold = sold;
        this.dateCreation = date;
    }
    public int getCode() {return code;}
    public double getSold() {return sold;}
    public Date getDateCreation() {return dateCreation;}
    public void setCode(int code) {this.code = code;}
    public void setSold(double sold) {this.sold = sold;}
    public void setDateCreation(Date dateCreation) {this.dateCreation = dateCreation;}
    
}
