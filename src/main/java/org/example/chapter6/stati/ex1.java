package org.example.chapter6.stati;

public class ex1 {
    public static void main(String[] args) {

        // 클래스 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 myMath = new MyMath2();
        myMath.a = 200L;
        myMath.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함
        System.out.println(myMath.add());
        System.out.println(myMath.subtract());
        System.out.println(myMath.multiply());
        System.out.println(myMath.divide());



    }
}
