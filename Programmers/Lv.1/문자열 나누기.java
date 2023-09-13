class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isFirst = true; // 첫번째 문자인지 체크
        char first_ch = ' '; // 첫번째 문자
        
        int same_cnt = 0; // 첫번째 문자와 같은 문자의 수
        int diff_cnt = 0; // 첫번쨰 문자와 다른 문자의 수
        
        for(int i=0; i<s.length(); i++) {
            if(isFirst) { // 첫번째 문자 차례인 경우
                first_ch = s.charAt(i); // 현재 순회한 문자를 저장
                isFirst = false; // 플래그를 false로 변경
                
                same_cnt++; // 자기 자신도 계산을 해야하므로 same_cnt에 값을 하나 더해준다.
            } else {
                if(first_ch == s.charAt(i)) same_cnt++;
                else diff_cnt++;
                
                if(same_cnt == diff_cnt) { // 값이 같게 되는 경우
                    isFirst = true; // 다시 첫번째 문자를 구해야 하므로 isFirst의 값을 true로 변경
                    answer++; // 단어를 분리했으므로 answer 값을 하나 증가시킨다.
                    
                    same_cnt = 0;
                    diff_cnt = 0; // 갯수 초기화
                }
            }
        }
        
        if(same_cnt != 0 || diff_cnt != 0) answer++; // 나머지 문자가 있는 경우 하나를 더 더한다.
        
        return answer;
    }
}
