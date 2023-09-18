
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    // 문자열 내 마음대로 정렬하기
    // 문제 설명
    // 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
    // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    //
    // input
    // String[] , int n
    //
    // 계산
    // 오름차순 정렬 sort()
    // List 사용 필요
    //
    // output
    // 문자열의 인덱스 n번째 글자 기준 오름차순 정렬
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(arr);

        answer = new String[arr.size()];

        for (int j = 0; j < arr.size(); j++) {
            answer[j] = arr.get(j).substring(1, arr.get(j).length());
        }
        return answer;
    }
}