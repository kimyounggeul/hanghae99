import java.util.ArrayList;
import java.util.List;
class Solution {
    // 제일 작은 수 제거하기
    // 문제 설명
    // 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
    // solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    // 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
    //
    // input
    // int[] arr
    //
    // 계산
    // MAx_VALUE를 통해 min 변수를 가장 작은 값으로 초기화
    // int[] List로 변경
    // List 다시 int[]로 만들기 
    //
    // output
    // int[] arr 배열 중 가장 작은 수를 제거 후 리턴
    // 단, 빈 배열인 경우 -1 리턴
   public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE; // MAX_VALUE 정수의 최대값
        List<Integer> list = new ArrayList<>();
        if(arr.length <= 1 ){
            return new int[] {-1};
        }

        for (int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
            }
        }

        list.remove(list.indexOf(min)); //indexOf  특정 문자 위치 찾기
        int[] newArr = new int[list.size()];
        for(int i=0; i<newArr.length; i++){
            newArr[i] = list.get(i);
        }
        return newArr;
    }
}