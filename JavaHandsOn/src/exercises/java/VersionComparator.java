package exercises.java;

import java.util.Comparator;

public class VersionComparator implements Comparator<String> {
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
