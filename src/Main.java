import interfaces.IAvion;
import interfaces.IVoiture;
import models.Voiture;
import models.Avion;
import models.VoitureFantomas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(" - Della Mobile");
        IVoiture dellaMobile = new Voiture("Telsa", "3");
        dellaMobile.accelerer();
        dellaMobile.tourner("gauche");
        dellaMobile.freiner();
        System.out.println();

        System.out.println(" - Balty");
        IAvion baltyVehicule = new Avion("Test", "42");
        baltyVehicule.decoler();
        baltyVehicule.atterrir("Canardville");

        System.out.println(" - Fantomas");
        VoitureFantomas vFantomas = new VoitureFantomas("Citroen", "DS");
        vFantomas.accelerer();
        vFantomas.decoler();

        IAvion test = vFantomas;
        test.atterrir("Sa planque secrete 🎭");
        ((IVoiture)test).freiner();





        IVoiture batModile = new IVoiture() {
            @Override
            public String getModele() {
                return "Bat Mobile";
            }

            @Override
            public String getMarque() {
                return null;
            }

            @Override
            public void accelerer() {

            }

            @Override
            public void freiner() {

            }

            @Override
            public void tourner(String direction) {

            }
        };





    }
}