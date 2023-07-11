package org.example.chapter4;

public class ex12 {
    public static void main(String[] args) {

//        0.0 <= Math.random() < 1.0
//        이 메서드는 0.0 과 1.0 사이의 범위에 속하는 double값을 반환

//        1과 3 사이의 정수 구하는 방법

//        1) 각 변에 3을 곱하기
//        0.0 * 3 <= Math.random() * 3 < 1.0 * 3
//        => 0 <= Math.random() * 3 < 3.0

//        2) 각 변을 int형으로 변환
//        (int)0.0 <= (int)(Math.random() * ) < (int)3.0
//        => 0 <= (int)(Math.random() * 3) < 3

//        3) 각 변에 1을 더하기
//        0 +1 <= (int)(Math.random() * 3) < 3 +1
//        => 1 <= (int)(Math.random() * 3) + 1 < 4

        int num;

        for (int i = 0; i < 6; i++) {
            num = (int)(Math.random() * 5 + 1);  // 1부터 5까지
            System.out.println(num);
        }




    }
}
