package org.example.chapter6.constructor;

public class Car2 {

    String color;       // 차량 색상
    String gearType;    // 차량 변속기 종류 - auto(자동), manual(수동)
    int door;           // 차량 문의 개수

    Car2() {        // 생성자의 이름으로 클래스명 대신 this 사용
        this("white", "auto", 4);
    }

    Car2(String color) {        // 오버로딩의 일종? 매개변수가 있기에 작동
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
