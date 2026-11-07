class Solution {
    public String[] solution(String[] names) {
        int length = (names.length + 4) / 5;
        String[] answer = new String[length];
        for (int i = 0; i < length; i++) {
            answer[i] = names[5 * i];
        }
        return answer;
    }
}