package org.example.chapter6.time;

public class Time {

    private int hour;       // 0 ~ 23시
    private int minute;     // 0 ~ 59분
    private float second;   // 0 ~ 59초


    // hour 의 값을 변경하기 위하 메서드, 지정한 값이 0보다 작거나 23보다 크면
    // 즉, 유요한 값이 아니면 변경하지 않고 메서드를 종료(return) 한다.
    public void setHour(int h) {
        if (h < 0 || h > 23 ) {
            return;
        }
        hour = h;
    }


}
