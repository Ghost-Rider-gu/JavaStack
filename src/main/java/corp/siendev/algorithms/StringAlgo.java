package corp.siendev.algorithms;

import java.util.Arrays;

public class StringAlgo {

    public boolean checkIfAnagram(String a, String b) {
        char[] firstArray = a.toLowerCase().toCharArray();
        char[] secondArray = b.toLowerCase().toCharArray();
        if (firstArray.length != secondArray.length) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < firstArray.length; i++) {
            counts[firstArray[i] - 97]++;
            counts[secondArray[i] - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean anotherCheckIfAnagram(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else if (a.length() != b.length()) {
            return false;
        }

        boolean isAnagram = false;
        char[] anagram1 = a.toCharArray();
        char[] anagram2 = b.toCharArray();
        Arrays.sort(anagram1);
        Arrays.sort(anagram2);
        if (Arrays.equals(anagram1, anagram2)) {
            isAnagram = true;
        }
        return isAnagram;
    }
}
