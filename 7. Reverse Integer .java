class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int result = 0;
        while(num > 0) {
            int tail = num % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail) / 10 != result) return 0;
            result = newResult;
            num /= 10;
        }
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
        
        return x < 0 ? -result : result;
    }
}