import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
    for(int i=0;i<nums.length;i++)
        mp.put(nums[i], i);
        
        for(int i=0;i<nums.length;i++) {
            int compl = target-nums[i];
            if(mp.containsKey(compl) && mp.get(compl)!=i)
                return new int[]{i, mp.get(compl)};
        }
     throw new IllegalArgumentException("No two sum solution");
        
    }
}