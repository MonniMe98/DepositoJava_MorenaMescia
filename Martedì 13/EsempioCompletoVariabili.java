public class EsempioCompletoVariabili {
    public static void main(String[] args) {
        // Esempio di dichiarazione e inizializzazione contestuale
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;

        System.out.println("--- Esempio 1: Dichiarazione e inizializzazione contestuale ---");
        System.out.println("provaNumero: " + provaNumero);
        System.out.println("provaTesto: " + provaTesto);
        System.out.println("provaBool: " + provaBool);

        // Esempio di dichiarazione e inizializzazione separate
        boolean altraProvaBool;
        altraProvaBool = false;
        System.out.println("\n--- Esempio 2: Dichiarazione e inizializzazione separate ---");
        System.out.println("altraProvaBool (iniziale): " + altraProvaBool);
        altraProvaBool = true;
        System.out.println("altraProvaBool (successivo): " + altraProvaBool);

        // Esempio di stampa di una variabile Stringa
        String testo = "Prova";
        System.out.println("\n--- Esempio 3: Stampa di una variabile Stringa ---");
        System.out.println(testo);

        // Esempio di combinazione di testo con una variabile
        testo = "Mondo";
        System.out.println("\n--- Esempio 4: Combinazione di testo con variabile ---");
        System.out.println("Ciao " + testo);

        // Esempio di combinazione di variabili Stringa
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println("\n--- Esempio 5: Combinazione tra variabili Stringa ---");
        System.out.println(fullPart);

        // Esempio di operatore + con valori numerici
        int x = 5;
        int y = 6;
        System.out.println("\n--- Esempio 6: Operatore + con valori numerici ---");
        System.out.println(x + y);

        // Esempio di dichiarazione multipla di variabili
        int a = 10, b = 20, c = 30;
        System.out.println("\n--- Esempio 7: Dichiarazione multipla di variabili ---");
        System.out.println(a + b + c);

        // Esempio di assegnazione multipla di variabili
        int p, q, r;
        p = q = r = 100;
        System.out.println("\n--- Esempio 8: Assegnazione multipla di variabili ---");
        System.out.println(p + q + r);
    }
}