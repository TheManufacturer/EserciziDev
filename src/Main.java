public class Main {
    public static void main(String args[]) {
        char mathOperation = 'a';
        numberForDay(mathOperation);
    }

    public static void numberForDay(char oper) {
        switch (oper){
            case 'a':
                System.out.println("Addizione");
                break;
            case 's':
                System.out.println("Sottrazione");
                break;
            case 'm':
                System.out.println("Moltiplicazione");
                break;
            case 'd':
                System.out.println("Divisione");
                break;
            default:
                System.out.println("Sei sicuro di aver inserito un valore corretto? [a-s-m-d]");
        }
    }

}

/*
Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
*/