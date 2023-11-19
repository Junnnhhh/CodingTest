import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder("");
        
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(char ch : X.toCharArray()) xArr[ch-'0']++;
        for(char ch : Y.toCharArray()) yArr[ch-'0']++;
        
        for(int i=9; i>=0; i--) {
            int min = xArr[i] < yArr[i] ? xArr[i] : yArr[i];
            
            for(int j=0; j<min; j++) {
                sb.append(String.valueOf(i));
            }
        }
        
        String answer = sb.toString();
        
        if(answer.equals("")) return "-1";
        else if(answer.indexOf("0") != -1 && answer.replace("0","").length()==0) return "0";

        return answer;
    }
}
