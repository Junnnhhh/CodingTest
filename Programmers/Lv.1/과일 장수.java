import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // k : 사과의 최대 점수, m : 한 상자에 들어갈 사과 갯수
        int answer = 0;
        
        Arrays.sort(score); // score 배열을 오름차순으로 정렬
        
        for(int i=score.length % m; i<score.length; i+=m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}
