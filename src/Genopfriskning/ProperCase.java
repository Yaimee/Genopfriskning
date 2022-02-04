package Genopfriskning;

public class ProperCase {
    public static String changeWords(String text) {
        String[] textToArray = text.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < textToArray.length; i++) {
            char[] word = textToArray[i].toCharArray();
            for (int u = 0; u < word.length; u++) {
                char characterToCheck = word[u];
                if (Character.isLowerCase(characterToCheck)) {
                    for (int n = 0; n < word.length; n++) {
                        word[n] = Character.toLowerCase(word[n]);
                        if (word.length > 3) {
                            char firstCharacterToUpperCase = Character.toUpperCase(word[0]);
                            word[0] = firstCharacterToUpperCase;
                            textToArray[i] = String.copyValueOf(word);
                        }
                    }
                }
                break;
            }
            sb.append(textToArray[i] + " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String newText = changeWords("hhHu HHHH dwhio HDIUWA dwiIjdWI ff FF");
        System.out.println(newText);
    }
}
