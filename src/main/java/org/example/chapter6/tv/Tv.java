package org.example.chapter6.tv;

public class Tv {

    //Tv의 속성(맴버 변수)
    String color;   // 색상
    boolean power;  // 파워 상태(on / off)
    int channel;    // 채널



    // Tv의 기능(메서드)
    void power() {
        power = !power; // Tv를 켜거나 끄는 기능의 메서드
    }
    void channelUp() {
        ++channel;      // Tv의 채널을 높이는 기능의 메서드
    }
    void channelDown() {
        --channel;      // Tv의 채널을 낮추는 기능의 메서드
    }







}
