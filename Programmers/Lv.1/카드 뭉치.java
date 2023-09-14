class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0; // cards1의 현재 인덱스
        int idx2 = 0; // cards2의 현재 인덱스
        
        for(String str : goal) {
            if(cards1.length > idx1 && str.equals(cards1[idx1])) {
                idx1++; // goal 참조하는 단어가 cards1에 존재하고 그 인덱스가 오버되지 않으면 idx1 값을 증가
            } else if(cards2.length > idx2 && str.equals(cards2[idx2])) {
                idx2++; // goal 참조하는 단어가 cards2에 존재하고 그 인덱스가 오버되지 않으면 idx2 값을 증가
            }
        }
        
        return idx1 + idx2 == goal.length ? "Yes" : "No"; // goal 안에 단어 갯수와 같으면 Yes를 아니면 No를 반환
    }
}
