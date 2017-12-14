class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] encountered = new boolean[nums.length - 1];
        for(int i = 0; i < nums.length; i++) {
            if(encountered[nums[i] % encountered.length])
                return nums[i];
            else
                encountered[nums[i] % encountered.length] = true;
        }
        return -1;
    }
}