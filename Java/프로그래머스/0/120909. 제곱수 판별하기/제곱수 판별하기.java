class Solution {
    public int solution(int n) {
        int answer = 0;
        int root = (int) Math.sqrt(n);
        if (root*root == n) answer = 1;
        else answer = 2;
        return answer;
    }
}