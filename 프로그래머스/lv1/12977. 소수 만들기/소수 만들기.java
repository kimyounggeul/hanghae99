import java.util.ArrayList;


class Solution {
    //
    // 소수 만들기
    // 문제 설명
    // 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
    // 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
    // nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를
    // return 하도록 solution 함수를 완성해주세요.
    //
    // input
    // int[] nums
    //
    // 계산
    // 소수 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
    //
    // output
    // int[] nums 에서 3개를 골라 더했을 때 소수가 되는 경우의 수
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for (Integer i : list) {
            int count = 2;
            answer++;
            while (count < i) {
                if (i % count == 0 ) {
                    answer--;
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}