import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi il numero (il programma si interrompe con 5) ");
        int numero= scanner.nextInt();

        printWithJump(numero);

        scanner.close();
    }

    public static void printWithJump(int num) {

        for( int i=1; i<=num; i++){
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }

    }

}


/*
Scrivi un programma che contenga un metodo che prende in ingresso
un valore numerico e stampa tutti i numeri fino al valore immesso,
la stampa dovrà saltare il valore uguale a 5.
 */
