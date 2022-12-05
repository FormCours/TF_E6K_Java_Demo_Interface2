package models;

import interfaces.IAvion;

public class Avion implements IAvion {

    private String modele;
    private String marque;

    @Override
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Avion(String marque, String modele) {
        this.modele = modele;
        this.marque = marque;
    }

    @Override
    public void decoler() {
        System.out.println("Le vehicule décole !");
    }
}
