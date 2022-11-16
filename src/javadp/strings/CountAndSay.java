package javadp.strings;

public class CountAndSay {
    public String countAndSay(int n) {
        String s = String.valueOf(n);
        if(s.length()==1){
            return "1"+s;
        }
        StringBuilder stringBuilder  = new StringBuilder();
        int curCount =1;
        char curChar = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==curChar) curCount++;
            else{
                stringBuilder.append(curCount).append(s.charAt(i-1));
                curChar = s.charAt(i);
                curCount = 1;
            }
        }
        stringBuilder.append(curCount).append(curChar);
        return stringBuilder.toString();

    }
}
