package Elementi_multimediali;

public class RegistrazioneAudio extends ElementoMultimediale implements Play{
    private int volume;
    private int durata;


    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public void abbassaVolume(){
        volume--;
    }
    public void alzaVolume(){
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
