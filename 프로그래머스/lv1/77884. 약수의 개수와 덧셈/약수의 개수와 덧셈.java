class Solution {
    // 약수의 개수와 덧셈
    // 문제 설명
    // 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    // 약수 = 어떤수를 나누어 떨어지게 하는 수
    //
    // input
    // int left, int right
    //
    // 계산
    // for문으로 반복
    // if문으로 약수 개수 찾기
    // if(left % i==0) , if(right % i==0)
    //
    // output
    // int left와 int right 의 약수 개수가 짝수인 건 더하고 홀수인건 빼기

    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left; i<=right; i++){ //left 부터 right 까지 정수 반복

            int count =0; // 각 정수에 대한 약수의 개수

            for (int j = 1; j<=i; j++) { // i에 대한 약수 찾기 j는 1부터 i까지 반복
                if (i % j == 0) { // 약수일때 카운트 1증가
                    count++;
                }
            }
            if (count % 2 ==0){ //카운트가 짝수인 경우 i를 answer에 더하기
                answer += i;
            } else {
                answer += i * -1;  // 카운트가 홀수일땐 i를 음수처리해서 answer에 더하기
            }
            }
        return answer;
    }
}

