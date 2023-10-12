public class Main{
    public static void main(String[] args) {

        char primo   = 'a';
        char secondo = 'b';
        confrontoChar(primo,secondo);

    }
    public static boolean confrontoChar (char a, char b){
        boolean confr= a==b;
        System.out.println("Prima var = " + a + " Seconda var = " + b + " Sono Uguali ? --> " + confr);
        return confr;
    }
}

//  Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
//  Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.