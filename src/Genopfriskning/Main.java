package Genopfriskning;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    static Bibliotek biblo = new Bibliotek(null);
    static Bog bog = new Bog("", "ter", 50);

    public static boolean doesArraylistContainString(ArrayList<String> newText, String text1) {
        if (!newText.contains(text1)) {
            newText.add(text1);
            return false;
        }
        System.out.println("The string has been found");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(biblo.isBookInList(bog));
    }
}
