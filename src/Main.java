
    public class Main {
        public static void main(String[] args) {
            int numero1 = 5;
            int numero2 = 7;

            int risultato = somma(numero1, numero2);

            System.out.println("La somma di " + numero1 + " e " + numero2 + " è: " + risultato);
        }

        public static int somma(int a, int b) {
            return a + b;
        }
    }