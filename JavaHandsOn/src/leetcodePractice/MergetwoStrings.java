package leetcodePractice;

public class MergetwoStrings {
    public static void main(String[] args) {

        String word1 = "abc";
        char[] word1arr= word1.toCharArray();
        String word2 = "xyzghi";
        char[] word2arr= word2.toCharArray();
        StringBuilder mergedWords= new StringBuilder();
        int l1= word1.length();
        int l2= word2.length();

        if(l1>l2){
            for(int i=0;i<l2;i++){
                mergedWords.append(word1arr[i]).append(word2arr[i]);
            }
            for (int i=l2 ; i<l1; i++){
                mergedWords.append(word1arr[i]);
            }
        }

        if(l1<l2){
            for(int i=0;i<l1;i++){
                mergedWords.append(word1arr[i]).append(word2arr[i]);
            }
            for (int i=l1 ; i<l2; i++){
                mergedWords.append(word2arr[i]);
            }
        }

        if(l1==l2){
            for(int i=0;i<l1;i++){
                mergedWords.append(word1arr[i]).append(word2arr[i]);
            }

        }

        System.out.println("Merged Words:"+mergedWords.toString());


    }
}
