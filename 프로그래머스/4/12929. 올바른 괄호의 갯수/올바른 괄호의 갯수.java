import java.util.*;

class Solution {
    
    public class Box{ 
        public String str; // 문자열
        public int l; // '(' 갯수
        public int r; // ')' 갯수
        Box(String str, int l, int r){ 
            this.str = str; 
            this.l = l;
            this.r = r;
        }
    }
    
    int answer;
    
    public int solution(int n) {
        
        Queue<Box> q = new LinkedList<>();
        answer =0;
        Box first = new Box("(",1,0); // 괄호쌍은 항상 '('로 시작
        q.add(first);
        
        while(!q.isEmpty()){
            
            Box b = q.poll();
            if(b.l<b.r){ continue; } // 모든인덱스 기준 ')'가 '('보다 많을 수 없음
            if(b.str.length()==2*n){ // 완성된 괄호쌍이 가능한지 검사
                check(b.str);
            }else{
                //각각의 문자는 n개보다 많을 수 없음
                if(b.l<n){ q.add(new Box(b.str+'(', b.l+1, b.r)); }
                if(b.r<n){ q.add(new Box(b.str+')', b.l, b.r+1)); }
            }
        }
        return answer;
    }
    //stack을 사용해서 하는게 국롤이지만 그냥 사용하지 않았다.
    public void check(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){ count++; }
            else{
                if(count<=0){ return; }
                else{ count--; }
            }
        }
        if(count==0){ answer++; }
    }
}