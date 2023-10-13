import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dammi il valore");
        int valore= scanner.nextInt();
        esegMolt(valore);

    }

    public static void esegMolt(int val) {
        int molt;
        for(int i=1; i<=10; i++){
            molt=val * i;
            System.out.println(val + " x " + i + "= " + molt);
        }
    }

}

/*
Scrivi un programma che contenga
un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero
che dovrà essere stampata a video.

#SonoLentissimooo XD
 */