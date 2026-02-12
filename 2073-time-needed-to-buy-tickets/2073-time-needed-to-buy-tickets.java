import java.util.*;

public class Solution {

    public static int timeRequiredToBuy(int[] t, int k) {
        int time = 0;

        for (int i = 0; i < t.length; i++) {
            if (i <= k)
                time += Math.min(t[i], t[k]);
            else
                time += Math.min(t[i], t[k] - 1);
        }

        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];

        for (int i = 0; i < n; i++)
            t[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(timeRequiredToBuy(t, k));
    }
}
