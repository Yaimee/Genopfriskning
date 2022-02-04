package Genopfriskning;

import java.util.Scanner;

public class Kvadrat {
    static Scanner sc = new Scanner(System.in);

    public static void tegnKvadrat(int heltal, String symbol) {
        for (int i = 0; i < heltal; i++) {
            for (int u = 0; u < heltal; u++) {
                System.out.print("" + symbol);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Indtast antallet kvadratets mål: ");
        int numberOfSymbols = sc.nextInt();
        sc.nextLine();
        System.out.println("Indtast symbol som skal bruges: ");
        String symbol = sc.nextLine();
        tegnKvadrat(numberOfSymbols, symbol);
    }
}
