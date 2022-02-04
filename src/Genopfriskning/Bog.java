package Genopfriskning;

import java.util.ArrayList;

public class Bog {
    private String ISBN;
    String titel;
    int udgivelsesår;

    Bog(String ISBN, String titel, int udgivelsesår) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Genopfriskning.Bog{" +
                "ISBN='" + ISBN + '\'' +
                ", titel='" + titel + '\'' +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }
}
