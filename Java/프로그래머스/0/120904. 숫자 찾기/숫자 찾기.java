class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num_str = String.valueOf(num);
        String k_str = String.valueOf(k);
        
        int index = num_str.indexOf(k_str);
        
        if (index != -1) answer = index + 1;
        else answer = -1;
        
        return answer;
    }
}