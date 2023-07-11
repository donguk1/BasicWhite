package org.example.chapter5;

public class ex5 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0; // 임시변수
        int j = 0;   // 임의의 값을 저장할 변수

        for (int i = 0; i < 6; i++) {
            j = (int)(Math.random() * 45);  // 0 ~ 44 까지 범위의 임의의 값

            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }





        for (int i = 0; i < 45; i++) {
            System.out.printf("ball[%d] = %d \n", i, ball[i]);
        }

    }
}
