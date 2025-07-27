import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[2];
        
        int count = 0;
        int zero_cnt = 0;
        
        while(!s.equals("1")){
            int rm_cnt = 0;
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i)=='1'){
                    rm_cnt++;
                }
                else{
                    zero_cnt++;
                }
            }
            s = Integer.toBinaryString(rm_cnt);
            count++;
            
        }
        answer[0] = count;
        answer[1] = zero_cnt;
        return answer;
    }
}