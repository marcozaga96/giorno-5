package Elementi_multimediali;

public class Video extends ElementoMultimediale implements Play{
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void aumentaLuminosita() {
        luminosità++;
    }

    public void diminuisciLuminosita() {
        luminosità--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosità));
        }
    }
}
