import Elementi_multimediali.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1: Immagine, 2: Audio, 3: Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità: ");
                    int luminosità = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosità);
                    break;
                case 2:
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido.");
                    i--;
                    break;
            }
        }

        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per terminare): ");
            scelta = scanner.nextInt();
            if (scelta > 0 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Play) {
                    ((Play) elemento).play();
                }
            }
        } while (scelta != 0);

        scanner.close();
    }
}