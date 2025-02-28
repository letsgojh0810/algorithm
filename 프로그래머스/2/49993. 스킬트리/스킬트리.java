import java.util.HashMap;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < skill.length(); i++)
            hashMap.put(skill.charAt(i), hashMap.size() + 1);
        for(String temp : skill_trees){
            int count = 0;
            boolean isOk = false;
            for(int i = 0; i < temp.length(); i++){
                if(hashMap.containsKey(temp.charAt(i))) {
                    if(count + 1 != hashMap.get(temp.charAt(i))) {
                        isOk = true;
                        break;
                    }
                    count++;
                }
            }
            if(!isOk)
                answer++;
        }
        return answer;
    }
}