class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int number : nums) {
            if(!hm.containsKey(number))
                hm.put( number, 1 );
            else
                result.add(number);
        }
        return result;
    }
}