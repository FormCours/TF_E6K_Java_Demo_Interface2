package interfaces;

public interface IAvion {

    String getModele();
    String getMarque();

    void decoler();
    default void atterrir(String lieu) {
        System.out.println("Le vehicule atterrit dans un aéroport de " + lieu);
    }
}
