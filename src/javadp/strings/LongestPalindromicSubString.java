package javadp.strings;

public class LongestPalindromicSubString {
    static String longest = "";
    public static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            String pal = checkForPalindrome(s.substring(i, s.length()));
            if(longest.length()<pal.length()) longest = pal;
        }
        return longest;
    }

    private static String checkForPalindrome(String substring) {
        String longestTillNow = "";
        for (int i = 0; i <= substring.length() / 2; i++) {
            String s = substring.substring(i, substring.length() - i);
            StringBuilder s1 = new StringBuilder(s);
            s1.reverse();

            if (s.equals(s1.toString())) {
                longestTillNow = s.toString();
                break;

            }
        }
        return longestTillNow;
    }

    public static void main(String[] args) {
        System.out.println(LongestPalindromicSubString.longestPalindrome("a"));
    }
}


