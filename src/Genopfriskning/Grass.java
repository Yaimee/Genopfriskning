package Genopfriskning;

import java.util.Scanner;

public class Grass {
    static Scanner sc = new Scanner(System.in);

    public static int trimming(double grassLength, double grassTrim) {
        return ((int) ((grassTrim - grassLength) / 0.2));
    }

    public static void main(String[] args) {
        System.out.println("How tall is the grass now?");
        double grassLength = sc.nextInt();
        sc.nextLine();
        System.out.println("How tall is the grass when it needs to be mowed?");
        double grassTrim = sc.nextInt();
        sc.nextLine();
        int grassLength2 = trimming(grassLength, grassTrim);

        if (grassLength > grassTrim) {
            System.out.println("The grass is way too long and must be mowed now");
        } else if (grassLength == 0) {
            System.out.println("The grass must be mowed today");
        } else if (grassLength > 0) {
            System.out.println("The grass is " + grassLength + " cm long, and must be mowed in " + grassLength2 + " days");
        }
    }
}
