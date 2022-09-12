package Programmers;

import java.util.*;

public class Lessons_12906 {

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 3, 0, 1, 1};
        int[] b = {4, 4, 4, 3, 3};
        solution(b);
    }

    public static ArrayList<Integer> solution(int[] arr) {

        /****
         * 1. 배열선언
         * 2. temp 배열과 arr 첫번째 자리 비교
         * 같을경우 첫번째 수만 남기고 제거
         * temp배열에 첫번쨰 수 남기고 전부 제거
         * temp의 마지막 숫자와 다음 arr배열 숫자 비교
         * 같을 경우 삭제, 다를경우 삽입
         * 반복
         * 최종 리턴
         *
         */

        ArrayList<Integer> arrList = new ArrayList<>();
        int arrListSize; //= arrList.size();
        for (int i : arr) {
            arrListSize = arrList.size();

            System.out.println("arrListSize: " + arrListSize);
            if (arrListSize == 0) {
                arrList.add(i);
            } else {
                if (i != arrList.get(arrListSize-1)) {
                    System.out.println("arrList.Value(): " + arrList.get(arrListSize-1).toString());
                    arrList.add(i);
                    System.out.println("i: " + i);

                }
            }
        }

        for(int i : arrList)
        {
            System.out.println("arrList : " + i);
        }

        return arrList;
    }
}