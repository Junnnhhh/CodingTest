class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length]; // 답을 저장할 배열의 크기를 미리 지정한다.
        
        for(int i=0; i<targets.length; i++) {
            String target = targets[i]; // targets 배열 안의 문자열을 하나씩 순회
            
            int sum = 0; // 문자열의 각 문자마다 자판을 누른 횟수를 합산할 변수를 선언
            
           for(int j=0; j<target.length(); j++) {
                int e = -1; // 자판을 누른 횟수 
                char ch = target.charAt(j);
                
                for(String s : keymap) {
                    int idx = s.indexOf(String.valueOf(ch)); 
                    
                    if(idx != -1) { // 자판으로 작성할 문자가 자판에 존재하는 경우
                        if(e == -1) e = idx + 1; // e 값에 -1이 아닌 자판에 존재하는 위치를 저장함
                        else if(e > idx + 1) e = idx + 1; // 다른 자판에서 더 적은 횟수로 입력이 가능한 경우
                    }
                }
                
                if(e == -1) { // 해당 문자를 자판으로 작성할 수 없으면 그 단어 자체는 성립할 수 없으니 현재 반복문 종료
                    sum = -1;
                    break;
                }
                
                sum += e;
            }
            
            if(sum > 0) answer[i] = sum; // sum이 양수인 경우 자판의 합을 저장
            else answer[i] = -1; // 음수인 경우 -1를 저장
        }
        
        return answer;
    }
}
