package Quest;

public class Solution3 {
    public int solution(String pos) {
        int dx[] = {1,1,-1,-1,2,2,-2,-2};
        int dy[] = {2,-2,-2,2,1,-1,-1,1};
        int cx = pos.charAt(0) - 'A';
        int cy = pos.charAt(1) - '0' - 1;
        int ans = 0;
        for (int i = 0; i < 8; ++i) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];
            if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8)
                ans++;
        }
        return ans;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String pos = "D4";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.printf("solution 함수의 반환 값은 %d 입니다.\n", ret);
    }
}
