class Solution {
    // input
    // int num
    //
    // 계산
    // num%2==0 짝
    // num%2==1 홀
    //
    // output
    // 짝수면 Even
    // 홀수면 Odd
    public String solution(int num) {
        String answer = "";
        if (num%2==0){
            answer="Even";
        } else{
            answer="Odd";
        }
        return answer;
    }
}