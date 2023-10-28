class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new  StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int idx = 0;
            if(ch != ' ') {
                if(ch >= 'A' && ch <='Z') {
                    idx = ((ch - 'A') + n) % 26;
                    ch =  (char) ((int) 'A' + idx);
                } else {
                    idx = ((ch - 'a') + n) % 26;
                    ch = (char) ((int) 'a' + idx);
                }
            }
            
            answer.append(ch);
        }
        
        return answer.toString();
    }
}
