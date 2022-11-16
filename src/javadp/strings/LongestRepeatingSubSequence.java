package javadp.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubSequence {
    public static int findLongestRepeatingSubSeq(String str){
        int size = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i< str.length();i++){
            if(map.containsKey(str.charAt(i))){
                if(map.get(str.charAt(i))==1){
                    map.put(str.charAt(i),2);
                    size++;
                }
            }
            else{
                map.put(str.charAt(i),1);
            }
        }


        return size;
    }

    public static void main(String[] args) {
        System.out.println(LongestRepeatingSubSequence.findLongestRepeatingSubSeq("abca"));
    }
}
