class Solution {

    // 이상한 문자 만들기
    // 문제 설명
    // 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    // 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    //
    // input
    // String s
    //
    // 계산
    // split() 사용 문자열을 일정하게 잘라서 배열로 저장
    // toUpperCase 대문자로 변환
    // toLowerCase 소문자로 변환
    //
    // ouput
    // 짝수 알파벳 대문자, 홀수알파벳 소문자
         public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int index = 0;
        for (int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                index =0;
            } else if (index % 2 == 0){
                str[i] = str[i].toUpperCase();
                index++;
            } else if (index % 2 != 0){
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        return answer;
    }
}