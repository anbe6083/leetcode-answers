class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < nums[end]) {
                //right half sorted
                if(target > nums[mid] && target <= nums[end]) {
                    //target is in right side
                    start = mid + 1;
                } else {
                    //target is in left side
                    end = mid - 1;
                }
            } else {
                //left half sorted
                if(target < nums[mid] && target >= nums[start]) {
                    //target in left half
                    end = mid - 1;
                } else {
                    //target in right half
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}