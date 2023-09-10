import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 답을 구할 배열의 크기를 미리 설정
        
        Map<String, Integer> map = new HashMap<>(); // 인원들에 대한 추억 점수를 저장할 map을 생성
        
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        } // 점수가 있는 인원들에 대한 이름과 추억 점수를 저장
        
        for(int i=0; i<photo.length; i++) {
            int size = photo[i].length;
            
            for(int j=0; j<size; j++) {
                answer[i] += map.getOrDefault(photo[i][j], 0);
            } // 각 사진마다 인원들을 확인하면서 map에 저장한 인원이 있는 경우 그 점수를 더하고 없는 경우 0을 더한다.
        }
        
        return answer;
    }
}
