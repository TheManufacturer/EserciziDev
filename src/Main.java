public class Main {
    public static void main(String[] args) {
        char[] charArray = createAndFillArray(10); // Crea un array di 20 caratteri casuali
        printArrayOccurrences(charArray, 'a');     // Stampa le occorrenze del carattere 'a'
    }

    // Metodo per creare e riempire un array di caratteri casuali
    public static char[] createAndFillArray(int length) {
        char[] array = new char[length]; // Crea un nuovo array di caratteri con la lunghezza specificata
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('a' + (int) (Math.random() * 26)); // Genera caratteri casuali tra 'a' e 'z'
            array[i] = randomChar; // Assegna il carattere casuale all'array
            System.out.println(array[i]);
        }
        return array; // Restituisce l'array riempito
    }

    // Metodo per contare e stampare le occorrenze di un carattere in un array
    public static void printArrayOccurrences(char[] array, char target) {
        int count = 0; // Inizializza il contatore delle occorrenze a zero

        for (char c : array) {
            if (c == target) {
                count++; // Incrementa il contatore se il carattere corrente è uguale al carattere target
            }
        }

        if (count > 0) {
            System.out.println("Occorrenze del carattere '" + target + "': " + count); // Stampa il numero di occorrenze
        } else {
            System.out.println("Nessuna occorrenza del carattere '" + target + "'"); // Stampa un messaggio se non ci sono occorrenze
        }
    }
}


/*
Scrivi un programma che contenga un metodo che crea un array
lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere
 -->  'a' oppure--> 0 [in caso non ce ne siano].
 */
