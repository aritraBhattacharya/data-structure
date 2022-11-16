package javadp.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringNonRepeatingChar {

    public static int lengthOfLongestSubstringOptimized(String s) {
        int start =0;
        int end =0;
        int length = 0;
        int counter=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(end<s.length() && start<s.length()){

            if(hm.get(s.charAt(end))==null){
                hm.put(s.charAt(end),1);
                counter++;
                end++;
            }
            else{
                if(length<counter){length = counter;}
                counter =0;
                start++;
                end = start;
                hm.clear();
            }

        }

        if(length<counter){length = counter;}


        return length;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int len = 0;

        int i = 0;
        int count = 0;
        int maxLen = 0;
        Map<Character, Integer> chrPosMap = new HashMap<>();
        while (i < s.length()) {
            Character iChar = s.charAt(i);
            if (!chrPosMap.containsKey(iChar)) {
                chrPosMap.put(iChar, i);
                i++;
                count++;
            }
            else {
                maxLen = Math.max(count, maxLen); // see if the substring till now has max len or not

                int prevIndex = chrPosMap.get(iChar);
                i = prevIndex + 1; // check again from this index, the index just after last occurrence of duplicate element : iChar
                count = 0; // reset the count
                chrPosMap.clear(); // clear all the elements
            }
        }
        if (count > maxLen) maxLen = count;
        return maxLen;
    }



    public static void main(String[] args) {
        System.out.println(LongestSubStringNonRepeatingChar.lengthOfLongestSubstring("aab"));
        System.out.println(LongestSubStringNonRepeatingChar.lengthOfLongestSubstringOptimized("aab"));
    }
}
