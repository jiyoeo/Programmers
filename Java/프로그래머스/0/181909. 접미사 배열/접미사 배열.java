import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> str = new ArrayList<>();
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            str.add(my_string.substring(i));
        }
        
        Collections.sort(str);
        
        String[] answer = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i);
        }
        
        return answer;
    }
}