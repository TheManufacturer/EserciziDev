public class Main{
    public static void main(String[] args) {
        int numero = 3;
        boolean propr= confrontoVal(numero);
        System.out.println("Il numero "+ numero + " è pari? --> " + propr);
    }
    public static boolean confrontoVal (int cfr){
        boolean confr= (cfr %2 ==0) &&true;
        return confr;
    }
}

/*
Scrivi un programma che contiene un metodo che prenda un numero in ingresso
e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.
*/