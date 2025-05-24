package ws;

public class BanqueService {
    public double conversion(double amount) {
        return amount * 11;
    }
    public Compte getCompte(){
        return new Compte();
    }
}
