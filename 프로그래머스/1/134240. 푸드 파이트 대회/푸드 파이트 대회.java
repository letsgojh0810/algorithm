class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i =0;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++)
                answer += Integer.toString(i);
        }
        String right = "";
        
        for(int i=answer.length()-1;i>=0;i--){
            right += answer.charAt(i);
        }
        
        return answer+"0"+right;
    }
}