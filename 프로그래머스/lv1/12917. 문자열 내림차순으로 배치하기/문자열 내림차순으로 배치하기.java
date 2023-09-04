import java.util.Arrays;
import java.util.Collections;

class Solution {
    // 문자열 내림차순으로 배치하기
    // 문제 설명
    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
    //
    // input
    // String S
    //
    // 계산
    // 문자열 -> 문자열 배열화 split()
    // 배열에서 내림차순 정렬
    //
    // output
    // 문자열 내림차순 정렬
    public String solution(String s) {
        String [] arr = s.split(""); //.split("") 특정 문자열을 분리해서 배열로 만듬
        Arrays.sort(arr, Collections.reverseOrder()); //sort 오름차순 정렬 , Collections.reverseOrder() 정렬을 역순으로 바꿈
        return String.join("", arr);
    }
}