class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}

//trim(): 앞뒤 여백 삭제
//split("\\s+"): \\s+ 기준으로 쪼갠다, //s+: 공백이 몇개든 뭉텅이 기준