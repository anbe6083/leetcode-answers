class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consequtiveOnes = 0, largestSeriesOfOnes = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                consequtiveOnes++;
                if(consequtiveOnes > largestSeriesOfOnes)
                    largestSeriesOfOnes = consequtiveOnes;
            } else {
                if(consequtiveOnes > largestSeriesOfOnes)
                    largestSeriesOfOnes = consequtiveOnes;
                consequtiveOnes = 0;
            }
        }
        return largestSeriesOfOnes;
    }
}