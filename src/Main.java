
    public class Main {
        public static void main(String[] args) {
            String testo = "Stringa da calcolare";

            int lunghezza = calcolaLunghezzaStringa(testo);

            System.out.println("La lunghezza della stringa è: " + lunghezza);
        }

        public static int calcolaLunghezzaStringa(String str) {
            return str.length();
        }
    }