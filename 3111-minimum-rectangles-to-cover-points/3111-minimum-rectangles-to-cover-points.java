import java.util.*;

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        // Sort by x-coordinate
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 0;
        int i = 0;
        int n = points.length;

        while (i < n) {
            count++;

            int start = points[i][0];
            int end = start + w;

            // Cover all points within [start, start + w]
            while (i < n && points[i][0] <= end) {
                i++;
            }
        }

        return count;
    }
}