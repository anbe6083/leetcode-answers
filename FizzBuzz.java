class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList();
        for(int i = 1; i <= n; i++) {
            String output = "";
            if(i % 3 == 0)
                output += "Fizz";
            if(i % 5 == 0)
                output += "Buzz";
            if(i % 3 != 0 && i % 5 != 0)
                output = Integer.toString(i);
            result.add(output);
        }
        return result;
    }
}