package leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int [] num = {1,3,8,6,7};
        int target=13;

        System.out.println("Result is: "+ Arrays.toString(sum(num, target)));
    }


//    Iterate through the indices of the input array, denoted as i
//    Check whether x ( i.e. target- num[i]) present in the HashMap
//        If the  Hashmap contains target-num[i],
//            return{i, hashmap.get(target-num[i])}
//        else
//             store it in HashMap(num[i], i)


    static int[] sum(int [] num, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<num.length; i++){

            if(map.containsKey(target-num[i]))
                return new int[] {i, map.get(target-num[i])};

            map.put(num[i], i);

        }

        return new int[0];
    }
}
