class Solution {
    // input 
    // 배열arr
    //
    // 계산
    // 1+2+3 / 3 = 평균값
    //
    // output
    // arr의 평균값
    public double solution(int[] arr) {
        double sum=0;
        double answer = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}