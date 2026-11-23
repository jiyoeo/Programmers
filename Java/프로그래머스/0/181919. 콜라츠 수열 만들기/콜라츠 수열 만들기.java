import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int x = n;
        
        while (x > 1) {
            list.add(x);
            if(x % 2 == 0){
                x /= 2;
            } else{
                x = x * 3 + 1;
            }
        }
        list.add(x);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}