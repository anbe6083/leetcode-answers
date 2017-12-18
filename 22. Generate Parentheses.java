class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        String substring = "";
        generateParens(substring, result, n, n);
        return result;
    }
    
    public List<String> generateParens(String substring, List<String> result, int left, int right) {
        if(left > 0) generateParens( substring + "(", result, left - 1, right );
        if(left < right) generateParens( substring + ")", result, left, right - 1 );
        if(left == 0 && right == 0) {
            result.add(substring);
        }
        return result;
    }
}