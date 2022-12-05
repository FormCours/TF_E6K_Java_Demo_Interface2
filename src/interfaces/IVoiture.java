package interfaces;

public interface IVoiture {
    String getModele();
    String getMarque();

    void accelerer();
    void freiner();
    void tourner(String direction);
}
