class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(!"1".equals(s)) {
            String s_removeZero = s.replace("0", "");
            
            int removedZeroCnt = s.length() - s_removeZero.length();
            
            s = Integer.toString(s_removeZero.length(), 2);

            answer[0] += 1;
            answer[1] += removedZeroCnt;
        }
        
        return answer;
    }
}
