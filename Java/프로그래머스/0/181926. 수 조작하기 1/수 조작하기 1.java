class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] control_arr = control.toCharArray();
        for (int i = 0; i < control_arr.length; i++){
            if (control_arr[i] == 'w') n += 1;
            else if (control_arr[i] == 's') n-= 1;
            else if (control_arr[i] == 'd') n+= 10;
            else n-= 10;
        answer = n;
    }
        return answer;
    }
}