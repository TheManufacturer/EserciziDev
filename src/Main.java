public class Main {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}
                };
        int n = matrix.length;
        int m = matrix[0].length;
        int sommaPrimaRiga = 0;

        for (int riga = 0; riga < n; riga++) {
            for (int colonna = 0; colonna < m; colonna++) {
                System.out.print(matrix[riga][colonna] + " ");
                sommaPrimaRiga=+matrix[riga][colonna];
            }
            System.out.println();
        }
        System.out.println("La somma della prima riga è --> " + sommaPrimaRiga);
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

