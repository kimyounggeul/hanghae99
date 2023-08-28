class Solution {
    // input 
    // int x 정수
    // int n 자연수
    //
    // 계산방법
    // x=2 2씩 증가하는 [2, 4, 6, 8, 10] n=5
    //
    //output 
    // x부터 x식 증가하는 숫자를 n개 지니는 list
    
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        for(int i=0; i<answer.length; i++){  
            answer[i] = (i+1)*(long)x;               //X x 2
    
        }
        return answer;
    }
}