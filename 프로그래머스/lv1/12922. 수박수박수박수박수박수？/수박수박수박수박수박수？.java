class Solution {
    // 수박수박수박수박수박수?
    //
    // 문제 설명
    // 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    // 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
    //
    // input
    // for문 사용 반복
    // if문으로 수와 박을 골라냄
    //
    // 계산
    // List String 만들기
    //
    // output
    // int n 에 따른 String n


    public String solution(int n) {
        String answer = "";
        for (int i=1; i<=n; i++){
            if (i%2==0){
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }
}