package org.example.chapter6.constructor;

public class Car {

    String color;       // 차량 색상
    String gearType;    // 차량 변속기 종류 - auto(자동), manual(수동)
    int door;           // 차량 문의 개수

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
