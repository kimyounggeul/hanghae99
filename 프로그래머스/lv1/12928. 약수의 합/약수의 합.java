class Solution {
    // 약수 = 어떤수를 나누어 떨어지게 하는 수
    
    // input
    // 
    // 계산
    // int i=0; i<=n; i++
    // 정수n%i ==0
    // 
    //output
    // return answer
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer;
    }
}