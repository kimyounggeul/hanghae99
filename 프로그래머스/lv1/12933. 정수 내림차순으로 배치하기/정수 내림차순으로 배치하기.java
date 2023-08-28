import java.util.Arrays;
import java.util.Collections;
class Solution {
    // 정수 내림차순으로 배치하기
    //문제 설명
    //함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    //
    // input
    // n
    //
    // 계산
    // 숫자 -> 문자열 String.valueOf
    // 배열 사용
    // 문자열 ->숫자
    //
    // output
    // n의 각자리수를 큰것부터 작은순으로 정렬한 정수
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n); // 숫자->문자열
        String [] list = str.split(""); // .split("") 특정 문자열을 분리해서 배열로 만듬
        Arrays.sort(list, Collections.reverseOrder()); // 내림차순 정렬
        str = String.join("", list); // 분리한 문자열을 하나의 문자열로 만듬
        answer = Long.parseLong(str);


        return answer ;
    }
}