import java.util.Scanner;

public class EsercizioUno {
    
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String stringa = myObj.nextLine();

        System.out.print("Inserisci la tua età: ");
        int numeroIntero = myObj.nextInt();
        myObj.nextLine(); // Consuma la newline pendente

        System.out.print("Inserisci la tua altezza (in metri, usa la virgola): ");
        double numeroDecimale = myObj.nextDouble();
        myObj.nextLine(); // Consuma la newline pendente

        System.out.print("Sei uno studente? (true/false): ");
        boolean valoreBooleano = myObj.nextBoolean();
        myObj.nextLine(); // Consuma la newline pendente

        //Stampare i valori con il tipo e l'altezza sdoppiata

        System.out.println("\n--- Riepilogo Input ---");
        System.out.println("Nome: " + stringa + ", Tipo: " + stringa.getClass().getSimpleName());
        System.out.println("Età: " + numeroIntero + ", Tipo: " + ((Object)numeroIntero).getClass().getSimpleName());
        System.out.println("Altezza: " + numeroDecimale + ", Tipo: " + ((Object)numeroDecimale).getClass().getSimpleName());
        System.out.println("Studente: " + valoreBooleano + ", Tipo: " + ((Object)valoreBooleano).getClass().getSimpleName());

        myObj.close();
    }
}
    

