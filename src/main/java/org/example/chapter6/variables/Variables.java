package org.example.chapter6.variables;

public class Variables {

    int iv;         // 인스턴스 변수(instance variable)
    // 생성시기는 클래스가 메모리에 올라갈 시
    // 클래스 영역에 선언
    // 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우 선언

    static int cv;  // 클래스 변수(static 변수, 공유변수, class variable)
    // 생성시기는 인스턴스가 생성되었을 시
    // 클래스 영역에 선언
    // 인스턴스 변수 앞에 static 만 붙이면 됨
    // 클래스이름.클래스변수 형식으로 사용



    void method() {
        int lv = 0; // 지역 변수(local variable)
        // 생성시기는 변수 선언문이 수행되었을 시
        // 메서드 내에 선언되어 메서드 내에서만 사용 가능
        // 즉, 메서드 종료시 소멸되어 사용 불가
        // 
    }


}
