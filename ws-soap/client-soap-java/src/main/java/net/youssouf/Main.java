package net.youssouf;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        Compte compte = proxy.getCompte(4);
        System.out.println("-------------------------------------------");
        System.out.println(compte.getCode());
        System.out.println(compte.getSold());
        System.out.println(compte.getDateCreation());

        proxy.compteListe().forEach(
                cp ->{
                    System.out.println(cp.getCode());
                    System.out.println(cp.getSold());
                    System.out.println(cp.getDateCreation());
                }
        );
    }
}