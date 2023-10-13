import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int contatoreA=0;
        char[] vector = new char[10];
        Random random = new Random();

        // Riempire il vettore con caratteri casuali
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Genera una lettera minuscola casuale
            if(randomChar!='a') {
                vector[i] = randomChar;
            }else{
                vector[i] = randomChar;
                contatoreA++;
            }
        }

        System.out.println("Riscontrato char < a > -->" + contatoreA);


        // Stampa il vettore
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vector[i]);
        }
        System.out.println(contatoreA);
    }
}



/*
Scrivi un programma che contenga un metodo che crea un array
lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere
 -->  'a' oppure--> 0 [in caso non ce ne siano].
 */
