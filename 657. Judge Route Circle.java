class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves == " ") return true;
        int xAxis = 0, yAxis = 0;
        for(int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if(move == 'U') 
                yAxis++;
            else if(move == 'D')
                yAxis--;
            else if(move == 'L')
                xAxis--;
            else
                xAxis++;
        }
        return xAxis == 0 && yAxis == 0;
    }
}