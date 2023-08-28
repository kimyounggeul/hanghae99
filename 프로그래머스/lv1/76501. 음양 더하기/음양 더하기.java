class Solution {
     // input
    // 정수배열 absolutes
    // 정수배열의 부호를 담은 불리연 배열 signs
    //
    // 계산
    // 배열끼리 대조해서 + 인지 -인지 확인
    // 확인 후 SUM
    //
    // output
    // signs으로 부호 확인해서 absolutes의 합계 구하기

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if (signs[i]==true){ //부호 배열에서 true 면 +
                answer += absolutes[i];
            } else {             //부호배열에서 false 면 -
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
