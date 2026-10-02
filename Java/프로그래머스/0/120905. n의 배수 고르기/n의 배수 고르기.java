import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist){
            if (num % n == 0) list.add(num);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}