package org.example.chapter7.tv;

public class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능 추가
    boolean caption;        // 캡션상태(on/off)  기본 off

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
