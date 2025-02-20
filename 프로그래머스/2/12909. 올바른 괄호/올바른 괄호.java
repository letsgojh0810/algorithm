import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean tf1 = false;
        boolean tf2 = false;
        boolean answer = false;
        int count = 0;
        
  
            if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')' ){
            tf2 = true;
            }else tf2 = false;
        
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==('('))
                count++;
            if(s.charAt(i)==(')'))
                count--;
            if(count<0)
                break;
        }
        if(count==0){
            tf1 = true;
        }
        if(tf1==true&&tf2==true)
            answer = true;
        else 
            answer = false;
         
        return answer;
    }
}