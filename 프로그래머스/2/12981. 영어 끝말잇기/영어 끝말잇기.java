import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        //단어 중복 체크를 위한 맵
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < words.length; i++) {
			if(i != 0) {
				String s1 = words[i - 1]; // 이전 단어
				String s2 = words[i]; // 현재 단어
				
				char last = s1.charAt(s1.length() - 1); // 이전 단어의 마지막 철자
				char first = s2.charAt(0); // 현재 단어의 처음 철자
				
				if(map.containsKey(s2) || last != first) { // 단어가 중복이거나 철자가 이어지지 않는 경우
					answer[0] = (i % n) + 1; // 번호
					answer[1] = (i / n) + 1; // 차례
					
					return answer;
				}
			}
			
			map.put(words[i], 1); // 사용한 단어 맵에 저장
		}

        return answer;
    }
}