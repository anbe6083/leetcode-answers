class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                    results[i] = j - i;
                    break;
                };
            }
            if(temperatures[i] != 0)
                continue;
            else
                temperatures[i] = 0;
        }
        return results;
    }
}