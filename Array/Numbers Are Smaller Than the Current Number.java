class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] fre = new int[101];
    
    for (int num: nums) {
      fre[num]++;
    }


    for (int i = 1; i < fre.length; i++) {
      fre[i] += fre[i - 1];
    }
        
    int[] ans = new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0)
        ans[i] = fre[nums[i] - 1];
      else 
        ans[i] = 0;
    }
        return ans;
}
}