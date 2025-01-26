import java.util.*;

class Solution {
  public int[] solution(int n, int s) {
        if(n > s) {
            return new int[] {-1};
        }
        int[] answer = new int[n];
        if(s % n ==0) {        //나눠지는 경우
            for(int i = 0 ; i < n; i++) {
                answer[i] = s / n;
            }
            
        }else {                //안나눠지는 경우
            int rem = s % n;
            int po = n - rem;    //1씩 더해줘야하는 인덱스 위치
            for(int i = 0; i < po; i++) {  //po까지는 원래대로 추가
                answer[i] = s / n;
            }
            for(int i = po; i < n; i++) {  //po부터 n까지는 1씩 추가
                answer[i] = s / n +1;
            }
        }
        return answer;
    }

}