    public class Main {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}
                };

        stampaMatrice(matrix);                     // Stampare la matrice

        int sommaPrimaRiga = sommaPrimaRiga(matrix);
        System.out.println("La somma della prima riga è --> " + sommaPrimaRiga);

    }

    public static int sommaPrimaRiga(int[][] matrix) {
        int somma = 0;
        for (int colonna = 0; colonna < matrix[0].length; colonna++) {
            somma += matrix[0][colonna];
        }
        return somma;
    }

    public static void stampaMatrice(int[][] matrix) {
        for (int riga = 0; riga < matrix.length; riga++) {
            for (int colonna = 0; colonna < matrix[0].length; colonna++) {
                System.out.print(matrix[riga][colonna] + " ");
            }
            System.out.println();
        }
    }
}


/*
Scrivere un programma che contenga un metodo che:
    permette di inizializzare una matrice riempita con dei valori a vostro piacimento
        restituisca la somma degli elementi sulla prima riga.
    ------
        int n= array.length;        --> Lunghezza righe
        int m= array[0].length;     --> Lunghezza colonne
 */

