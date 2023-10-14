public class TrovAeDistruggi {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 5, 6, 6, 7}; // Array con elementi duplicati
        int[] clone = trovaeDistruggi(array); // Chiama il metodo per rimuovere duplicati

        System.out.println("Array con duplicati: ");    // Stampa l'array risultante senza duplicati
        for (int i = 0; i < array.length; i++) {
            System.out.print("a. " +array[i]);
        }
        System.out.println();

        System.out.println("Array senza duplicati: ");    // Stampa l'array risultante senza duplicati
        for (int i = 0; i < clone.length; i++) {
            System.out.print("b." + " " +clone[i]);
        }
    }

    // Metodo per rimuovere gli elementi duplicati da un array di interi
    public static int[] trovaeDistruggi(int[] arr) {
        int n = arr.length; // Lunghezza dell'array originale

        // Conta quanti elementi unici ci sono nell'array
        int contUnici = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                contUnici++;
            }
        }

        // Crea un nuovo array per gli elementi unici
        int[] cleanArray = new int[contUnici];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                cleanArray[index] = arr[i];
                index++;
            }
        }

        return cleanArray; // Restituisce l'array senza duplicati
    }
}

/*
Scrivere un programma che contenga un metodo che:

Permetta di rimuovere gli elementi duplicati
in un array di interi.

L'array ottenuto dovrà essere stampato a video.

-------
Andiamo ad utilizzare questi 2 for (i / j) per -->
**      confrontare la posizione attuale con la precedente

*   Al primo ciclo del for esterno non viene eseguito il for interno    *
_______
for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
 _______
 -------
 */

