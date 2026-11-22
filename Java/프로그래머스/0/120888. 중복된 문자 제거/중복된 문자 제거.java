import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if (set.add(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}