class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Boolean> hm = new HashMap<Integer,Boolean>();
        for(int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i]))
                hm.put( nums[i], true );
        }
        for(int i = 1; i <= nums.length; i++ ) {
            if( !hm.containsKey(i) )
                result.add(i);
        }
        return result;
    }
}