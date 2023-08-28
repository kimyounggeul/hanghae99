
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
  // input
    // 배열의 요소
    //
    // 계산
    // 배열에 있는 수를 랜덤 divisor 로 나눔
    // 배열에 있는 수중 divisor로 나누어서 떨어지는 값을 배열로 리턴
    // 예 [5,9,7,10] 중 divisor가 5일때 나누어 떨어지는 [5,10] 을 리턴
    // int 배열을 list 로 변환필요
    // 변환한 것을 % divisor == 0 일때 배열에 담기
    // 0 이라면 -1  배열에 담기
    //
    // output
    //divisor로 나누었을 때 떨어지는 원소를 배열로 리턴

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer>list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) { //배열 값이 divisor로 나누어 떨어지면
                list.add(arr[i]); //리스트 저장
            }
        }
        if (list.size()==0){ // 리스트 크기가 0인경우
            list.add(-1);   // - 1 저장
        }
        answer = new int[list.size()]; // 만든 list 크기 만큼 answer 생성

        for(int i=0; i< list.size(); i++){ // list 값 answer에 복사
            answer[i] = list.get(i);
        }
            Arrays.sort(answer);//answer를 오름차순 정렬
        return answer;
        }
    }

