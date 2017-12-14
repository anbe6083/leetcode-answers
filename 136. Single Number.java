class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> intCount = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if( !intCount.containsKey(nums[i]) ) {
                intCount.put( nums[i], 1 );
            } else {
                int count = intCount.get( nums[i] );
                count++;
                intCount.put( nums[i], count );
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            int count = intCount.get( nums[i] );
            if(count == 1) 
                return nums[i];
        }
        return -1;
    }
}