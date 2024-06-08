package exercises.java;

import java.util.Arrays;
import java.util.Comparator;

public class VersionCompare {
    public static void main(String[] args) {
        String[] arr = {"1.2.3", "3.4.1", "5.10.1", "6.2.8", "2.8.1", "1.2.9"};

        Arrays.sort(arr, new VersionComparator().reversed());

        for (String s : arr) {
            System.out.println(s);
        }
    }

    static class VersionComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String[] parts1 = s1.split("\\.");
            String[] parts2 = s2.split("\\.");

            int minLength = Math.min(parts1.length, parts2.length);

            for (int i = 0; i < minLength; i++) {
                int part1 = Integer.parseInt(parts1[i]);
                int part2 = Integer.parseInt(parts2[i]);

                if (part1 < part2) {
                    return -1;
                } else if (part1 > part2) {
                    return 1;
                }
            }

            return Integer.compare(parts1.length, parts2.length);
        }
    }
}
