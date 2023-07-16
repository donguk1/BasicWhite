package org.example.chapter6.method;

public class ex1 {
    public static void main(String[] args) {

        MyMath myMath = new MyMath();

        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.subtract(5L, 3L);
        long result3 = myMath.multiply(5L, 3L);
        double result4 = myMath.divide(5L, 3L); // Long 값이 매개변수로 들어갔으나 자동 형변환됨

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);



    }
}
