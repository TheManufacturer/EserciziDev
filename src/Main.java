
    public class Main {
        public static void main(String[] args) {
            char carattere1 = 'A';
            char carattere2 = 'B';

            int valoreAscii1 = (int) carattere1;
            int valoreAscii2 = (int) carattere2;

            int sommaValoriAscii = valoreAscii1 + valoreAscii2;

            System.out.println("Valore ASCII di " + carattere1 + ": " + valoreAscii1);
            System.out.println("Valore ASCII di " + carattere2 + ": " + valoreAscii2);
            System.out.println("Somma dei valori ASCII: " + sommaValoriAscii);
        }
    }