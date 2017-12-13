class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = left; i <= right; i++) {
            int num = i;
            while(num > 1) {
                    int currDigit = num % 10;
                    if(currDigit == 0) 
                        break;
                    else {
                        if(i % currDigit != 0)
                            break;
                        else {
                            num /= 10;
                        }
                    }
            }
            if(num <= 1) 
                result.add(i);
        }
        return result;
    }
}