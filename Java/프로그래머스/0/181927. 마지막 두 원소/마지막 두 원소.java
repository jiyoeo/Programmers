import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        if (answer[length-1] > answer[length-2]){
            answer[length] = answer[length-1] - answer[length-2];
        }
        else answer[length] = answer[length-1] * 2;
        return answer;
    }
}