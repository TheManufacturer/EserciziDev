public class Main {
    public static void main(String args[]) {
        String stringToWork = "Questa è la stringa che analizzeremo";
        int lenght = stringToWork.length();
        controlloLung(lenght);
    }

    public static void controlloLung(int b) {
        if ( b >10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (b<10) {
            System.out.println("Lunghezza minore di 10");
        }else if (b == 10){
            System.out.println("Lunghezza pari a 10");
        }
    }

}
/*
Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
"Lunghezza minore di 10" o "Lunghezza pari a 10".

Test:
    "Questa è la stringa che analizzeremo"      --> OK
    "iosononano"                                --> OK
    "Mario"                                     --> OK
*/