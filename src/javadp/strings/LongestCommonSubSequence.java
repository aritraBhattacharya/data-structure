package javadp.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestCommonSubSequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int finalRes = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < text1.length(); i++) {
            if (map1.get(text1.charAt(i)) == null) {
                map1.put(text1.charAt(i), 1);
            } else {
                int count = map1.get(text1.charAt(i));
                count++;
                map1.put(text1.charAt(i), count);
            }
        }

        for (int j = 0; j < text2.length(); j++) {
            if (map2.get(text2.charAt(j)) == null) {
                map2.put(text2.charAt(j), 1);
            } else {
                int count = map2.get(text2.charAt(j));
                count++;
                map2.put(text2.charAt(j), count);
            }
        }

        Set<Character> chSet = map1.keySet();

        for (Character ch :
                chSet) {
            if (map2.get(ch) != null) {
                finalRes += (Math.min(map1.get(ch), map2.get(ch)));
            }
        }
        return finalRes;
    }

    public static int longestCommonSubsequenceDP_APPROACH(String text1, String text2) {
        int m = text1.length() + 1;
        int n = text2.length() + 1;
        int[][] masterTable = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    masterTable[i][j] = 0;
                } else {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        masterTable[i][j] = masterTable[i - 1][j - 1] + 1;
                    } else {
                        masterTable[i][j] = Math.max(masterTable[i - 1][j], masterTable[i][j - 1]);
                    }
                }
            }
        }
        return masterTable[m-1][n-1];




    }

    public static void main(String[] args) {
        //System.out.println(LongestCommonSubSequence.longestCommonSubsequence("abcde", "ace"));
        System.out.println(LongestCommonSubSequence.longestCommonSubsequenceDP_APPROACH("abcde", "ace"));
    }
}
