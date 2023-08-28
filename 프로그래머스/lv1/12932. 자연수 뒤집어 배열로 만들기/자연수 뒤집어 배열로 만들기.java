import java.util.ArrayList;
class Solution {

/*
* 자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/

    // input
    // 자연수 n
    //
    // 계산
    // 자연수 n을 뒤집기 reverse()
    // 숫자->문자열  "".toString or String.valueOf()
    // 뒤집은거 배열화 필요
    //
    // output
    // 자연수 n을 뒤집어 각자리 숫자를 원소로 가지는 배열
    public int[] solution(long n) {
            ArrayList<Integer> arrInt = new ArrayList<>(); //Array list 형 자료구조 개체 만듬
            StringBuilder strReverse = new StringBuilder(String.valueOf(n)); //reverse 사용하기 위해 StringBuilder 클래스 생성, 숫자n을 문자열로 변경
            strReverse = strReverse.reverse();//문자열n을 뒤집기
            for (int i = 0; i < strReverse.length(); i++)
                arrInt.add(Integer.parseInt(String.valueOf(strReverse.charAt(i)))); //charAT 문자열 안에 몇번째 문자인지를 char 형으로 가지고옴 add 가 저장 문자열n 뒤집기까지
        return arrInt.stream().mapToInt(i->i).toArray(); // mapToInt = Interger 를 int로 바꿔서 toArray 배열을 만들어줌
       
    }
}