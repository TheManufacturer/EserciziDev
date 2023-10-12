
public class Main{

    public static void main(String[] args) {

        int primo   = 10;
        int secondo = 2;
        int terzo   = 7;

        System.out.println("La media è " + media(primo,secondo, terzo));
    }
    public static double media (int a, int b, int c){
        double mediaeff = (double)(a+b+c)/3;
        return mediaeff;
    }

}

//  Definisci un metodo che calcoli la media tra 3 numeri e
//  restituisca il risultato che dovrà essere stampato.