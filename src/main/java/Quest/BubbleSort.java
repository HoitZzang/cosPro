package Quest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public void swap(int[] param){
        int tmp = 0;

        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length-i-1; j++) {
                if(param[j] > param[j+1])
                {
                    tmp = param[j];
                    param[j] = param[j+1];
                    param[j+1] = tmp;

                }else if(param[j] == param[j+1]) {
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] k = {9,3,5,2,1,6,8,7};

        BubbleSort bubble = new BubbleSort();

        bubble.swap(k);
        System.out.println("answer :: " + Arrays.toString(k));

    }
}
