class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strAB = String.valueOf(a) + String.valueOf(b);
        String strBA = String.valueOf(b) + String.valueOf(a);
        
        int resultAB = Integer.parseInt(strAB);
        int resultBA = Integer.parseInt(strBA);
        
        if (resultAB >= resultBA) {
            answer = resultAB;
        } else {
            answer = resultBA;
        }
        
        return answer;
    }
}