package javadp.recursion.easy;

public class ReverseArray {
    public char[] reverseString(char[] s) {
        if(s.length==0 || s.length==1){
            return s;
        }
        else if(s.length==2){
            char temp = s[0];
            s[0] = s[1];
            s[1] = temp;
            return s;
        }
        else{
            //stub
            return s;
        }
    }


}
