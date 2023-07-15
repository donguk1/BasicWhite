package org.example.chapter6.tv;

public class ex1 {
    public static void main(String[] args) {
        Tv t = new Tv();    // 인스턴스를 참조하긴 위한 변수 t와 생성을 선언

        t.channel = 7;      // 멤버변수 channel 의 값을 7
        t.channelDown();;
        System.out.println("현재 채널은 " + t.channel + " 입니다.");



    }
}
