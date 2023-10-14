public class Main {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6}
                };

        int n = matrix.length;      // Indice delle righe
        int m = matrix[0].length;   // Indice delle colonne

        int[][] newMatrix = scambioRC(matrix, n, m);
        stampaMatrice(matrix);
        stampaMatrice(newMatrix);
    }

    public static int[][] scambioRC(int[][] matrice, int righe, int colonne) {
        int[][] nuovaMatrice = new int[colonne][righe];

        for (int riga = 0; riga < righe; riga++) {
            for (int colonna = 0; colonna < colonne; colonna++) {
                nuovaMatrice[colonna][riga] = matrice[riga][colonna];
            }
        }

        return nuovaMatrice;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int riga = 0; riga < matrice.length; riga++) {
            for (int colonna = 0; colonna < matrice[0].length; colonna++) {
                System.out.print(matrice[riga][colonna] + " ");
            }
            System.out.println();
        }
    }
}


/*
Scrivere un programma che contenga un metodo che
permette di inizializzare una matrice e di scambiare
le sue righe e le sue colonne stampandola a video.

Matrice di partenza

1 2 3
4 5 6
Matrice risultato

 1 4
 2 5
 3 6
 */

