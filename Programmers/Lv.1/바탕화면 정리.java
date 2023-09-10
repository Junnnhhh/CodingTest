class Solution {
    public int[] solution(String[] wallpaper) {
        int x1 = 50; int y1 = 50; // 바탕화면의 위치상 최대 지점의 좌표
        int x2 = 0; int y2 = 0; // 바탕화면의 위치상 최소 지점의 좌표
        
        for(int i=0; i<wallpaper.length; i++) {
            String str = wallpaper[i]; // 바탕화면을 가로 줄로 나눴을 때, 한 줄씩 참조

            // 결국 정리할 파일들에 최소 위치 좌표와 최대 위치 좌표를 구하면 최소한의 이동거리로 모든 파일을 지울 수 있다.
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '#') { // 가로 줄을 열로 나눴을 떄, 해당 열에 파일이 있는 경우
                    x1 = Math.min(x1, j); 
                    y1 = Math.min(y1, i);
                    x2 = Math.max(x2, j);
                    y2 = Math.max(y2, i);
                }
            }
        }
        
        return new int[] {y1, x1, y2+1, x2+1};
    }
}
