package org.example.chapter2;

public class ex6 {
    public static void main(String[] args) {

        long big = 100_000_000_000L;  //1000000000000L을 의미
        /**
         * 리터럴 = 값을 의미
         * 변수 or 상수에 저장될 값을 의미
         * 변수(variable) : 하나의 값을 저장하기 위한 공간
         * 상수(constant) : 값을 한번만 저장할 수 있는 공간
         */

        double rate = 1.618d;
//        double 타입의 값에 접두사 'd' or 'D' 붙이기 (생략 가능)
        float pi = 3.14f;
//        float  타입의 값에 접두사 'f' or 'F' 붙이기 (생략 불가)
        /**
         *  double 은 실수형의 기본 자료형이기에 접두사가 생략 가능
         *  마찬가지로 int 도 정수형의 기본 자료형
         *  그렇기에 실수형 float 과 long 의 접미사 'f', 'l'
         */


        System.out.println(rate);
    }
}
