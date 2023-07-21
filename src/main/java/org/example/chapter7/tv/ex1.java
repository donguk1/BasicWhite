package org.example.chapter7.tv;

public class ex1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;       // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();

        System.out.println(stv.channel);

        stv.displayCaption("Hello, World");
        stv.caption = true;     // 캡션(자막) 기능 on
        stv.displayCaption("Hello, World");

    }
}
