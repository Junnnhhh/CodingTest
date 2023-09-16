class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number + 1];

        /*
          숫자를 하나씩 참조하면서 배열에 약수의 갯수를 더해준다.
          이 부분이 매우 중요.

          i는 중복이 되지 않고 number까지 배수가 될 수 있는 배열 인덱스에 값을 하나씩 더함.
        */
        for(int i=1; i<=number; i++) {
            for(int j=1; j<=number/i; j++) {
                arr[i * j]++;
            }
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > limit) answer+=power;
            else answer+=arr[i];
        }
        
        return answer;
    }
}
