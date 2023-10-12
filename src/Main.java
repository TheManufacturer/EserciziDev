import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args) {

        int primo   = 5;
        int secondo = 3;
        confronto(primo,secondo);

    }
    public static void confronto (int a, int b){
        boolean confr= a==b;
        System.out.println("Prima var = " + a + " Seconda var = " + b + " Sono Uguali ? --> " + confr);
    }
}

    // Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
    // Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.