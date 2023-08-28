class Solution {
    // input
    // String [] seoul
    //
    // 계산
    // 배열에서 특정 값 찾기 
    // for, if 사용
    //
    // output
    // 배열상 "kim" 위치
    // "김서방은 몇번째 위치에 있다"
 public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}