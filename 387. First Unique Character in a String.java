class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Boolean> hashmap = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            
            if(!hashmap.containsKey(s.charAt(i))) {
                boolean isUnique = true;
                hashmap.put(s.charAt(i), isUnique);
            } 
            else {
                boolean isUnique = false;
                hashmap.put(s.charAt(i), isUnique);
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(hashmap.get(s.charAt(i))) return i;
        }
        return -1;
    }
}