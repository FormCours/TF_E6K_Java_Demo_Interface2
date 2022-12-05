package models;

import interfaces.IAvion;

public class VoitureFantomas extends Voiture implements IAvion {

    public VoitureFantomas(String marque, String modele) {
        super(marque, modele);
    }

    @Override
    public void decoler() {
        System.out.println("Le vehicule décoler mysterieusement");
    }

    @Override
    public void atterrir(String lieu) {
        System.out.println("Le vehicule atterrit à " + lieu);
    }
}
