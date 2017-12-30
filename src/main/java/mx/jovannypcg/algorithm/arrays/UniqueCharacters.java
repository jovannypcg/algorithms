package mx.jovannypcg.algorithm.arrays;

import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 * Consider a string with ASCII characters.
 *
 * @author Jovanny Cruz
 */
public class UniqueCharacters {
    private static final int ASCII_CHARACTERS = 128;

    public static boolean isUnique_withArray(String str) {
        if (str.length() > ASCII_CHARACTERS) { return false; }

        Boolean[] characterFlags = new Boolean[ASCII_CHARACTERS];
        Arrays.fill(characterFlags, false);

        for (int i = 0; i < str.length(); i++) {
            int character = str.charAt(i);

            if (characterFlags[character]) {
                return false;
            }

            characterFlags[character] = true;
        }

        return true;
    }
}
