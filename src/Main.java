
public class Main{
    public static void main(String[] args) {

        int primo   = 5;
        int secondo = 3;

        System.out.println("Il risultato incrementato e moltiplicato è " + workStrange(primo,secondo));
    }
    public static double workStrange (int a, int b){
        a=a+1;
        System.out.println(a); // vediamo l'incremento di a
        b=b+2;
        System.out.println(b); // vediamo l'incremento di b
        int workato=a*b;
        return workato;
    }
}

//  Scrivi un programma che contiene un metodo che date due variabili
//  le incrementi di un valore scelto da te e le moltiplichi fra di loro.