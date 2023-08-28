class Solution {

    // 하샤드 수
    // 문제 설명
    //양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    //
    // input
    // int x     숫자
    //
    // 계산
    // 12
    // 1+2 = 3 이 3으로 12를 나눔
    // 12 % 3 = 0 true
    //
    // output
    // 하샤드의 수이면 true 아니면 false

    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        String numStr = String.valueOf(x); // 숫자를 문자열로 변경 12를  "12"로 변경
        String [] str = numStr.split(""); // 문자열을 나누어 배열에 저장 ["1", "2"]
        for (String num : str){
            sum+= Integer.parseInt(num); // 문자열을 숫자로 변환
            if (x%sum==0){
                answer = true;
            }else {
                answer = false;
            }
        }

        return answer;
    }
}