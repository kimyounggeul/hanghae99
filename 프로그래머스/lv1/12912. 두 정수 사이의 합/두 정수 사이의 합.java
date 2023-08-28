class Solution {
    //두 정수 사이의 합
    //문제 설명
    //두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    //예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
    //
    // input
    // int a, int b
    //
    // 계산
    // a=3 , b= 5
    // 3+4+5=12
    //
    // output
    //
    //answer = a와 b 사이에 속한 정수의 합을 리턴
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i=min; i<=max; i++){
            answer += i;
        }

        return answer;
    }
}