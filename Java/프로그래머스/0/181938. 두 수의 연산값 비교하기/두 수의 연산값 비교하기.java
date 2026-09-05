class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strAB = String.valueOf(a) + String.valueOf(b);
        int resultAB = Integer.parseInt(strAB);
        
        if (resultAB >= 2*a*b){
            answer = resultAB;
        } else {
            answer = 2*a*b;
        }
        
        return answer;
    }
}