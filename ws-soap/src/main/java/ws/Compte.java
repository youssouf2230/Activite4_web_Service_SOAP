package ws;
import java.time.LocalDate;
import java.util.Date;

public class Compte {
    private int code;
    private double sold;
    private LocalDate dateCreation;
    public Compte() {}
    public Compte(int code, double sold, Date dateCreation) {
        this.code = code;
        this.sold = sold;
    }
    public int getCode() {return code;}
    public double getSold() {return sold;}
    public LocalDate getDateCreation() {return dateCreation;}
    public void setCode(int code) {this.code = code;}
    public void setSold(double sold) {this.sold = sold;}
    public void setDateCreation(LocalDate dateCreation) {this.dateCreation = dateCreation;}
    
}
