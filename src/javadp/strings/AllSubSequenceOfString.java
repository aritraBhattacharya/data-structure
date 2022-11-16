package javadp.strings;

public class AllSubSequenceOfString {

    private static void findSubsequences(String s, String ans) {
        if(s.isEmpty()) return;

        if(s.length()==1){
            System.out.println("\""+ans+"\"");
            System.out.println("\""+ans+s+"\"");
        }
        else{
            findSubsequences(s.substring(1,s.length()),ans); // do not include the first element
            String newAns = ans+s.charAt(0);
            findSubsequences(s.substring(1,s.length()),newAns); // do not include the first element
        }
    }

    public static void main(String[] args) {
        AllSubSequenceOfString.findSubsequences("abcde","");
    }
}
