class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        int start = 1;
        
        for(int i=1; i<=area; i++) {
            int brownCnt = 0;
            
            if(area % i == 0) {
                brownCnt = (i + (area/i)) * 2 - 4;
                
                if(yellow == area-brownCnt) {
                    answer[0] = i;
                    answer[1] = area / i;
                }
            }
        }
        
        return answer;
    }
}
