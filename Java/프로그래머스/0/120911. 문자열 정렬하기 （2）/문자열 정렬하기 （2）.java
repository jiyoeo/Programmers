import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] Arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(Arr);
        answer = new String(Arr);
        return answer;
    }
}