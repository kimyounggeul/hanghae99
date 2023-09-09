class Solution {
 // 3진법 뒤집기
    // 문제 설명
    // 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
    // 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
    //
    // input
    // int n
    //
    // 계산
    // 3진 법 계산 n % 3 n / 3
    // 3진법 -> 10진법 변환 parseInt 사용
    //
    // output
    // n을 3진법상에서 앞뒤로 뒤집은 후 다시 10진법 하기
    public int solution(int n) {
        String answer = "";

        while (n > 0){
            answer += n % 3;
            n /= 3 ;
        }
        return Integer.parseInt(answer, 3);
    }
}