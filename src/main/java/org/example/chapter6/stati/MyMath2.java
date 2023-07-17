package org.example.chapter6.stati;

public class MyMath2 {

    long a, b;


    // 인스턴스 변수 a, b 만을 이용해서 작업하므로 매개변수가 필요 없음
    // a, b는 인스턴스 변수
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 인스턴스 변수화 관계없이 매개변수만으로 작업이 가능
    // a, b 는 지역변수
    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(long a, long b) {
        return a / b;
    }

}
