public class Main {
    public static void main(String[] args) {
        printArray();

    }

    public static void printArray() {
        int somma=0;
        int[] numero=new int[10];

        for( int i=0; i<10; i++){
            numero[i]=i + 1;
            somma= somma +numero[i];
        }
        System.out.println("la somma dei numeri contenuti nell'array --> " + somma);

    }

}


/*
Scrivi un programma che contenga un metodo che crea un array
lo riempie con i numeri da 1 a 10
che che calcoli la somma dei numeri contenuti nell'array inizializzato
e la stampi a video.
 */
