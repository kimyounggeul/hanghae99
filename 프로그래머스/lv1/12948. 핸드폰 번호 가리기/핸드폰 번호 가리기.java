class Solution {
    // input
    // 문자열 phone_number
    //
    // 계산법
    // phone_number의 뒷자리 -4 만 숫자로 살리기
    //
    // ouput
    // 뒷 4자리를 제외한 나머지 숫자르 *로 변환
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) { // phone_number의 길이에서 -4를 뺀수
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
}




