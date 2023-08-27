package org.forEach;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);

        aList.forEach(intData -> System.out.println("arrList Data : " + intData));

        System.out.println("-------------------------------");

        int[] aa = new int[]{1, 2, 3};

        for (int i : aa) {
            System.out.println("aa : " + i);
        }

    }
}
