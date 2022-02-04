package Genopfriskning;
import java.util.Scanner;
public class Sortering {
    static String[] textVault = new String[5];

    public static void reverseAlphabeticalorder()
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < textVault.length; i++)
        {
            System.out.print("Enter value: ");
            textVault[i] = sc.nextLine();
        }
        for (int i = 0; i < textVault.length; i++)
        {
            for (int u = i; u  < textVault.length; u++)
            {
                char c1 = textVault[i].toLowerCase().charAt(0);
                char c2 = textVault[u].toLowerCase().charAt(0);
                if (c1 < c2)
                {
                    String buffer = textVault[i];
                    textVault[i] = textVault[u];
                    textVault[u] = buffer;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(textVault[i]);
        }
    }

    public static void main(String[] args) {
        reverseAlphabeticalorder();
    }
}
