package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lessons_42840 {

    public static void main(String[] args){
        //int[] answers = {1,2,3,4,5};
        int[] answers = {1,3,2,4,2};
        //int[] answers = {3,3,1,1,2};
        solution(answers);

    }

    public static ArrayList<Integer> solution(int[] answers) {

        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        int answersLen = answers.length;
        for (int i=0; i < answersLen; i++)
        {
            if(answers[i] == supoja1[ i % supoja1.length ])
            {
                score1++;
            }
            if(answers[i] == supoja2[ i % supoja2.length ])
            {
                score2++;
            }
            if(answers[i] == supoja3[ i % supoja3.length ]){
                score3++;
            }
        }

        int max = Math.max(Math.max(score1,score2), score3);
        System.out.println("max1 : " + max);

        ArrayList<Integer> bestMember = new ArrayList<Integer>();

        if(score1 == max)
            bestMember.add(1);
        if(score2 == max)
            bestMember.add(2);
        if(score3 == max)
            bestMember.add(3);

        Collections.sort(bestMember);
        bestMember.removeAll(Arrays.asList(Integer.valueOf(0)));

        return bestMember;
    }

}
