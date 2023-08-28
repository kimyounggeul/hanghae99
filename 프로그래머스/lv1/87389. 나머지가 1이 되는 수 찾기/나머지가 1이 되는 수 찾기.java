class Solution {
        // 나머지가 1이 되는 수 찾기
    // input
    // n
    // 
    // 계산법
    // int n 매개변수
    // n%x==1 가장 작은 자연수 x 
    //
    //output
    // return answer
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }        
        return answer;
    }
}