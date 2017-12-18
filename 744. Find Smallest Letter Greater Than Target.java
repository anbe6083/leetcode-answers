class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targetVal = (int) target;
        int smallestDiff = Integer.MAX_VALUE, smallestIndex = 0;
        for(int i = 0; i < letters.length; i++) {
            int currLetterVal = (int) letters[i];
            if(Math.abs((currLetterVal - targetVal)) < smallestDiff && currLetterVal > targetVal) {
                smallestDiff = Math.abs((currLetterVal - targetVal));
                smallestIndex = i;
            }
        }
        return letters[smallestIndex];
    }
}