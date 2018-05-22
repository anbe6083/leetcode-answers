class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--)
        {

            if(digits[i] == 9)
            {
                // if we are at index 0
                // we need to create a new array
                // of length+1
                if(i == 0)
                {
                    int[] resultArray = new int[digits.length + 1];
                    resultArray[0] = 1;
                    return resultArray;
                }
                else
                {
                    digits[i] = 0;
                }
            }
            else
            {
                digits[i]++;
                break;
            }
        }

        return digits;
    }
}