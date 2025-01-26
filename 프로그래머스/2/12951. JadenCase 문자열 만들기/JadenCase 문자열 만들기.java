import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split(""); //모두 소문자로 만들고 sp 에 배열로 split 저장
        boolean flag = true ; // flag 값을 boolean으로 생성함. 검증기 역할
        
        for(String newSP : sp){
            answer += flag ? newSP.toUpperCase() : newSP; // answer에 반복문으로 누적 저장
            // flag 가 true 값이면 ss를 대문자로, 아니면 소문자 상태로 삽입. "첫번째는 true로 초기화 되었기 때문에 대문자!"
            flag = newSP.equals(" ") ? true : false;
            // if(flag=newSP.equals(" "))
            //     flag = true;
            // else 
            //     flag = false;
            // !! 이 후 ss가 공백인지 아닌지를 판별 후 flag 값을 true/false로 초기화 시키며 반복하다가 true 일때마다
            // (공백이 있을때 마다) 대문자로 바꿔줌.
        }
        
        
        return answer;
    }
}