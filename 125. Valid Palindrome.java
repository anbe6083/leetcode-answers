class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return true;
        int i = 0, j = s.length() - 1;
        while(i < j) {
            while(i < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(j > 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}