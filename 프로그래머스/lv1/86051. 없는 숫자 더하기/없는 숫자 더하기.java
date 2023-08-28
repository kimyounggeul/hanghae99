class Solution {
  // input
    // int[] numbers
    //
    // 계산
    // 0~9 다 더 하면 45 여기에서 있는 숫자를 뺀다
    // 45 에서 배열에 있는 숫자를 for문으로 계속뺌
    //
    // output
    // numbers에서 찾을 수 없는 0~9 까지 숫자의 sum
    // answer += ?

    public int solution(int[] numbers) {
        int answer = 45;
        for (int i=0; i<numbers.length; i++){
            answer-=numbers[i];
       }
        return answer;
    }
}