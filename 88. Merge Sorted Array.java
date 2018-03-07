class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, mergeIndex = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) { 
                nums1[mergeIndex] = nums1[i];
                i--;
            }
            else { 
                nums1[mergeIndex] = nums2[j];
                j--;
            }
            mergeIndex--;
        }
        while(j >= 0) {
            nums1[mergeIndex] = nums2[j];
            mergeIndex--;
            j--;
        }
    }
}