package exercises.java;

import java.util.Arrays;
import java.util.Comparator;
//Using Arrays.Sort
public class VersionCompareReverse {
    public static void main(String[] args) {
        String[] arr = {"1.2.3", "3.4.1", "5.10.1","2.8.0", "6.2.8", "2.8.1", "1.2.9", "2.8"};

        Arrays.sort(arr, new VersionComparator().reversed());

        for (String s : arr) {
            System.out.println(s);
        }
    }


}
