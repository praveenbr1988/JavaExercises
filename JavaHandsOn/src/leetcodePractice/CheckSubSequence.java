package leetcodePractice;

public class CheckSubSequence {
    public static void main(String[] args) {

        String s1 = "bdcc";
        String s2 = "bdsfgdfddcdgfdc";

        int i=0;
        for (char c : s2.toCharArray()){
            if((s1.charAt(i)==c) && (i<s1.length())){
                i+=1;
            }
        }

        if (i==s1.length())
            System.out.println("Subsequnec is TRUE");
        else
            System.out.println("Subsequnec is FALSE");



    }
}

