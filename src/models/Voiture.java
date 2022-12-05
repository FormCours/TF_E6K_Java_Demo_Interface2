package models;

import interfaces.IVoiture;

public class Voiture implements IVoiture {

    private String marque;
    private String modele;

    @Override
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }


    @Override
    public void accelerer() {
        System.out.println("Le vehicule accelere");
    }

    @Override
    public void freiner() {
        System.out.println("Le vehicule freine");
    }

    @Override
    public void tourner(String direction) {
        System.out.println("Le vehicule tourne à " + direction);
    }

    public void klaxoner() {
        System.out.println("qsjfbqskjdbkjlqs");
    }
}
