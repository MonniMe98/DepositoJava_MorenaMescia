public class EsempioVariabili {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione contestuale
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;

        System.out.println("Valore di provaNumero: " + provaNumero);
        System.out.println("Valore di provaTesto: " + provaTesto);
        System.out.println("Valore di provaBool: " + provaBool);

        System.out.println("\n--- Dichiarazione e inizializzazione separate ---");

        // Dichiarazione
        boolean altraProvaBool;

        // Inizializzazione
        altraProvaBool = false;
        System.out.println("Valore iniziale di altraProvaBool: " + altraProvaBool);

        // Riassegnazione
        altraProvaBool = true;
        System.out.println("Valore successivo di altraProvaBool: " + altraProvaBool);
    }
}