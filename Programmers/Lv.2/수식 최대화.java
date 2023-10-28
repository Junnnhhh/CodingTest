import java.util.*;

class Solution {
    public long solution(String expression) {
        long answer = 0;
        
        String[] calArr = {"*+-", "*-+", "+*-", "+-*", "-*+", "-+*"};
        String[] tokens = expression.replace("+", "!+!").replace("*", "!*!").replace("-", "!-!").split("!");
        
        for(String cal : calArr) {
            List<String> tokenList = new ArrayList<>();
        
            for(String token : tokens) tokenList.add(token);
            
            for(int i=0; i<cal.length(); i++) {

                int idx = tokenList.indexOf(String.valueOf(cal.charAt(i)));
                
                while(idx != -1) {
                    long num1 = Long.valueOf(tokenList.get(idx - 1));
                    long num2 = Long.valueOf(tokenList.get(idx + 1));
                    
                    tokenList.remove(idx+1);
                    tokenList.remove(idx);
                    tokenList.remove(idx-1);
                    
                    if(cal.charAt(i) == '*') {
                        tokenList.add(idx-1, String.valueOf(num1 * num2));
                    } else if(cal.charAt(i) == '+') {
                        tokenList.add(idx-1, String.valueOf(num1 + num2));
                    } else if(cal.charAt(i) == '-') {
                        tokenList.add(idx-1, String.valueOf(num1 - num2));
                    }
                    
                    idx = tokenList.indexOf(String.valueOf(cal.charAt(i)));
                }
            }
            
            long num = Math.abs(Long.valueOf(tokenList.get(0)));
            
            if(answer < num) answer = num;
        }
        
        return answer;
    }
}
