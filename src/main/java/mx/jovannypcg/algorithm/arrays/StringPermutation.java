package mx.jovannypcg.algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * @author Jovanny Cruz
 */
public class StringPermutation {
    private static final int ASCII_CHARACTERS = 128;

    public static boolean perform_withArray(String target, String match) {
        if (target.length() != match.length()) { return false; }

        int[] charCounter = new int[ASCII_CHARACTERS];

        target.chars().forEach(character -> charCounter[character]++);

        for (char c : match.toCharArray()) {
            int counterIndex = (int) c;
            charCounter[counterIndex]--;

            if (charCounter[counterIndex] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean perform_withMap(String target, String match) {
        if (target.length() != match.length()) { return false; }

        Map<Integer, Integer> mapCounter = getMapCounter(target);

        for (int characterInMatch : match.toCharArray()) {
            if (!mapCounter.containsKey(characterInMatch)) {
                return false;
            }

            mapCounter.put(characterInMatch, mapCounter.get(characterInMatch) - 1);

            if (mapCounter.get(characterInMatch) < 0) {
                return false;
            }
        }

        return true;
    }

    private static Map<Integer, Integer> getMapCounter(String target) {
        Map<Integer, Integer> mapCounter = new HashMap<>();

        target.chars().forEach(characterInTarget -> {
            if (mapCounter.containsKey(characterInTarget)) {
                mapCounter.put(characterInTarget, mapCounter.get(characterInTarget) + 1);
            } else {
                mapCounter.put(characterInTarget, 1);
            }
        });

        return mapCounter;
    }
}
