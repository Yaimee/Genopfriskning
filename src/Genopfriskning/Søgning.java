package Genopfriskning;
import java.lang.Object;

public class Søgning {
    public int findWordInArray(String[] array, String word)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(word))
            {
                return i;
            }
        }
        return -1;
    }

    public int findWordInArrayV2(String[] array, String word) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(word))
            {
                return i;
            }
        }
        //løbet tør for energi;
        return -1;
    }
}
