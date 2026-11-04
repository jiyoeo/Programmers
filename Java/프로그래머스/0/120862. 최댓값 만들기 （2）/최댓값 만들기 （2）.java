import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length - 1;
        int answer = (numbers[0] * numbers[1] > numbers[len] * numbers[len - 1]) ? numbers[0] * numbers[1] : numbers[len] * numbers[len - 1];
        return answer;
    }
}