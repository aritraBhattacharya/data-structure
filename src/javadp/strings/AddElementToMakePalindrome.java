package javadp.strings;

public class AddElementToMakePalindrome {
    private int count = 0;
    public int minChar(String str) {
        if (!isPalindrome(str)) {
            count++;
            minChar(str.substring(0,str.length()-1));
        }

        return count;
    }

    private boolean isPalindrome(String s) {
        int l = s.length();
        if(l==1) return true;

        for (int i = 0, j = l - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AddElementToMakePalindrome addElementToMakePalindrome = new AddElementToMakePalindrome();
        System.out.println(addElementToMakePalindrome.minChar("ABC"));
    }
}
