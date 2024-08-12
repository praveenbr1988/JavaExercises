package leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefixInString {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println("Result is: "+ findCommonPrefix(strs));
    }


//    Take the first word from the string and store it in a variable as prefix
//    Now iterate the array from the 2nd word
//    Now put another loop to check the 2nd element is starts with index "prefix". If it starts , then it returns 0
//    Condition will  fail and common preix is identified between 1st and 2nd word.HashMap
//    If not, the 2nd word is minimized until a common prefix is found.


    static String findCommonPrefix(String [] strs){

        if(strs==null){
            return "";
        }

        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;

    }
}
