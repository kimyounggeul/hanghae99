class Solution {
    // input
    // num
    //
    // 계산
    // num % 2 = 0 짝수
    // num % 2 = 1 홀수 * 3 +1
    //
    // output
    // 반복 횟수
    // 반복 횟수== 500 일땐 -1
    public int solution(long num) {
        int answer = 0; // 반복 횟수
        while (num != 1) {
                if (num % 2 == 0) { //6 % 2=0 짝수
                    num /= 2; // 6/2 = 3
                    answer++;
                } else {
                    num = num * 3 + 1;   // 3*3+1= 10
                    answer++;
                }
                if (answer == 500) {
                    answer=-1;
                    break;
                }
            }
        return answer;
        }
    }
