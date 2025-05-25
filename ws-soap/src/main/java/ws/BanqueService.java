package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "amount") double amount) {
        return amount * 11;
    }
    public Compte getCompte(int code){
        return new Compte(code, Math.random()*60000, new Date());
    }
    public  List<Compte> compteListe(){
        return List.of(
                new Compte(1, Math.random()*60000, new Date()),
                new Compte(2, Math.random()*60000, new Date()),
                new Compte(3, Math.random()*60000, new Date())
        );
    }

}
