class Solution {
    public int solution(int n) {
        int answer = 0;
        int count  = 0;
        String str = Integer.toBinaryString(n);
        
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='1')
                count ++; //1의 개수 값
        }
        
        
        for(int i = n+1; i<1000000;i++){
            int count2 = 0;
            String str2 = Integer.toBinaryString(i);
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)=='1')
                    count2 ++;
            }
                if(count == count2){
                    answer = i;
                    break;
            }
        }
        
        
        
        return answer;
    }
}