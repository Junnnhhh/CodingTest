class Solution {
    public String getFastHand(int left, int right, int press, String hand) {
        int[][] arr = new int[][]{{0, 0}, {-1, 3}, {0, 3}, {1, 3}, {-1, 2}, {0, 2}, {1, 2}, {-1, 1}, {0, 1}, {1, 1}, {-1, 0}, {1, 0}};
        
        int leftToPress = Math.abs(arr[left][0] - arr[press][0]) + Math.abs(arr[left][1] - arr[press][1]);
        int rightToPress = Math.abs(arr[right][0] - arr[press][0]) + Math.abs(arr[right][1] - arr[press][1]);
        
        if(leftToPress > rightToPress) return "right";
        else if(leftToPress < rightToPress) return "left";
        else {
            return hand;
        }
    }
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder("");
        int leftFinal = 10;
        int rightFinal = 11;
        
        for(int number : numbers) {
            switch(number) {
                case 1: case 4: case 7:
                    leftFinal = number;
                    sb.append("L");
                break;
                case 3: case 6: case 9:
                    rightFinal = number;
                    sb.append("R");
                break;
                default:
                    String check = getFastHand(leftFinal, rightFinal, number, hand);
                    
                    if(check.equals("left")) {
                        leftFinal = number;
                        sb.append("L");
                    } else {
                        rightFinal = number;
                        sb.append("R");
                    }
                break;
            }
        }
        
        return sb.toString();
    }
}
