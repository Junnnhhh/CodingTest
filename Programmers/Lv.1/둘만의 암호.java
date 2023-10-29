import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        ArrayList<Character> list = new ArrayList<>();
        
        for(char ch = 'a'; ch <= 'z'; ch++) {
            list.add(ch);
        }
        
        for(int i = 0; i < skip.length(); i++) {
            int idx = list.indexOf(skip.charAt(i));
            list.remove(idx);
        }

        String answer = "";
        
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            int idx1 = (list.indexOf(ch) + index) % list.size();
            
            answer += String.valueOf(list.get(idx1));
        }
        
        return answer;
    }
}
