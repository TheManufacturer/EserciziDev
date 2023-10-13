import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi il numero da analizzare ");
        int numero= scanner.nextInt();

        System.out.println("quanti risultati vuoi ottenere?");
        int risultati= scanner.nextInt();

        esegCalc(numero, risultati);

        scanner.close();
    }

    public static void esegCalc(int num,int lim) {

        for( int i=num; i>0 && lim>0; i--){
            System.out.println(i);
            lim--;
        }

    }

}

/*
Scrivi un programma che contenga un metodo che prende in ingresso un numero
e il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali
in ordine inverso
(Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati
mi aspetto in uscita [6 5 4] stampati).
 */