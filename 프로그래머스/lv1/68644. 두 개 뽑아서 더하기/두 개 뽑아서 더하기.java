import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {

    // 두 개 뽑아서 더하기
    // 문제 설명
    // 정수 배열 numbers가 주어집니다.
    // numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
    //
    // intput
    // int[] numbers
    //
    // 계산
    // 중복값 허용안하는 HashSet 사용
    // for문 으로 반복
    //
    // output
    // int[]numbers 안에 있는 두 개의 수의 합


        public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        ArrayList<Integer> list  = new ArrayList<>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}