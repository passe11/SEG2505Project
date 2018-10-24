package com.example.pc1.livrable1;

public class Profil {
    public Service[] offre;
    public boolean[][] disponible = new boolean[365][24];
    public double noteDeService;
    public double nombreDeNote=0;
    public String categorie;

    public Profil(Service[] services,String section,boolean[][] dispo){
    offre = services;
    categorie = section;
    }
    public void Rate(double rating) {
        if (nombreDeNote == 0) {
            noteDeService = rating;
        } else {
            noteDeService = (noteDeService * nombreDeNote + rating) / (nombreDeNote + 1);
        }
        nombreDeNote++;
    }
    public boolean Reserve(int jour,int[]heures){


    }
}
