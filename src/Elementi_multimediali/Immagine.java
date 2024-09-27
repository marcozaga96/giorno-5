package Elementi_multimediali;

public class Immagine extends ElementoMultimediale{
    private int luminosità;
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità= luminosità;
    }

    public void aumentaLuminosita() {
        luminosità++;
    }

    public void diminuisciLuminosita() {
        luminosità--;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosità));
    }
}
