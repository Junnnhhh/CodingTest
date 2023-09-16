class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        /* n + 1 크기를 가진 배열을 생성하고, 해당 배열 인덱스에 약수의 개수를 저장한다. */
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n/i; j++) {
                arr[i*j]++;
            }
        }
        /* 약수의 갯수가 2개인 수는 소수이므로 2개인 인덱스의 합을 구한다. */
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) answer++;
        }
        
        return answer;
    }
}
