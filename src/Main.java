
public class Main{

    public static void main(String[] args) {

        int dividendo = 10;
        int divisore = 2;

        System.out.println("Il quoziente è " + divisione(dividendo,divisore));
    }
    public static double divisione (int a, int b){
        double quoziente = (double)a/(double)b;
        return quoziente;
    }

}

    //Definisci un metodo per la divisione di 2 numeri interi che
    // restituisca il quoziente che dovrà essere stampato.