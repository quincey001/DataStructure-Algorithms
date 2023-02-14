package Guidewire;

public class EvenString {
    public static int minLettersToRemove(String word) {

        int[] charCounts = new int[26]; // count of each character
        for (char c : word.toCharArray()) {
            charCounts[c - 'a']++; // increment count for current character
        }
        int numOddCounts = 0; // number of characters with odd counts
        for (int count : charCounts) {
            if (count % 2 != 0) {
                numOddCounts++;
            }
        }
        // If the word is already an even word, return 0
        if (numOddCounts == 0) {
            return 0;
        }
        // Otherwise, return the number of letters that need to be removed
        return numOddCounts - 1;
    }

    public static void main(String[] args) {
        System.out.println(minLettersToRemove("even word"));
    }

}
