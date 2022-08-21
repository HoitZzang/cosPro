package Quest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution2 {

    public int solution(int n){

        int cha; //달팽이의 차수 지정 변수
        int row;
        int col;
        int k = 0; //달팽이 안쪽으로 들어갈 수록 감소되는 행, 열 만큼 깎아줄 변수

        int arr[][] = new int[n][n]; //달팽이 배열
        int value = 1; //달팽이 배열에 넣을 숫자

        int answer = 0;
        return answer;

    }


    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int n1 = 3;
        int ret1 = sol.solution(n1);


        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");

        //int n2 = 2;
        //int ret2 = sol.solution(n2);

        // Press Run button to receive output.
       // System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
