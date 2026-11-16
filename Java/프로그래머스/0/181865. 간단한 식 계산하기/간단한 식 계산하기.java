class Solution {
    public int solution(String binomial) {
        String[] part = binomial.split(" "); // " "로 나눠서 배열에 저장
        int a = Integer.parseInt(part[0]);
        String op = part[1];
        int b = Integer.parseInt(part[2]);
        if (op.equals("+")) return a+b;
        else if (op.equals("-")) return a-b;
        else return a*b;
    }
}