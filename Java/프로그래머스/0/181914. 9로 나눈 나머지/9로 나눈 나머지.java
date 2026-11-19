class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0'; // 문자를 숫자로 변환하기
        }
        return sum % 9;
    }
}