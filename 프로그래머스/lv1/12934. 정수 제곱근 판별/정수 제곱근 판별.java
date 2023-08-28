class Solution {
    //정수 제곱근 판별
    //문제 설명
    //임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    //n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    //
    // input
    // long n
    //
    // 계산
    //  예) 11의 제곱은 121 이므로 제곱근=11 11은 x 121은 x 제곱
    //
    // output
    // n 제곱근 = x+1의 제곱
    // n != 제곱근 = -1

    
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n); // n의 제곱근
        if (x * x == n) { // 실수인지 정수인지 판별
            answer = (long) Math.pow((x + 1), 2);
        }  else {
            answer =-1; // -1 리턴
        }

        return answer;
    }
}
