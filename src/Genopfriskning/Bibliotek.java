package Genopfriskning;

import java.util.ArrayList;
import out.production.PerfectMenu.*;

public class Bibliotek {
    Bog bog;
    Bog bog1 = new Bog("sb111", "Heste", 1972);
    Bog bog2 = new Bog("ku222", "Hunde", 2021);
    Bog bog3 = new Bog("je333","Aber", 2005);
    ArrayList<Bog> bogListe = new ArrayList<>();

    Bibliotek(Bog bog) {
        this.bog = bog;
    }

    public boolean isBookInList(Bog bog) {
        bogListe.add(bog);
        bogListe.add(bog1);
        bogListe.add(bog2);
        bogListe.add(bog3);
        return bogListe.contains(bog.getISBN());
    }

    public void setBog(Bog bog) {
        this.bog = bog;
    }
}
