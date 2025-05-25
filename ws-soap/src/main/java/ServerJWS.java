import jakarta.xml.ws.Endpoint;
import ws.BanqueService;
import ws.Compte;

import java.util.ArrayList;
import java.util.List;

public class ServerJWS {
  public static void main(String[] args) {
      String url = "http://0.0.0.0:9090/JWS";
      Endpoint.publish(url, new BanqueService());
      System.out.println("Server started : "+url);
      BanqueService service = new BanqueService();
      List<Compte> comptes = new ArrayList<Compte>();
      for (int i = 0; i < 10; i++) {
          comptes.add(service.getCompte(i));
      }
      for (Compte compte : comptes) {
          System.out.println(compte.getCode());
          System.out.println(compte.getSold());
          System.out.println(compte.getDateCreation());
      }
    }
}
