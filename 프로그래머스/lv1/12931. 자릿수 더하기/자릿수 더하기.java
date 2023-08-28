import java.util.*;

public class Solution {
    // input
    // 자연수 n
    //
    // 계산
    // 자연수 n 은 문자열
    // 숫자->문자열 Integer.toString()
    // 문자열->숫자로 변환 Integer.parseInt()
    // 후 sum
    //
    // output
    // n의 각 자릿수의 합
    public int solution(int n) {
        int answer=0;
        String transStr=Integer.toString(n);
        for (int i=0; i<transStr.length();i++){
            answer += Integer.parseInt(transStr.substring(i, i+1));
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}