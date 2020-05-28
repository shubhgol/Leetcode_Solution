import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {

        int count = 0;
        if (k < 0)
            return 0;

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int n = nums.length;

        for (int i = 0; i < n; i++)
            mp.put(nums[i], i);

        for (int i = 0; i < n; i++) {

            int x = nums[i] + k;
            if (mp.containsKey(x) && mp.get(x) != -1 && i != mp.get(x)) {
                mp.put(x, -1);

                count++;
            }

        }

        return count;
    }
}
