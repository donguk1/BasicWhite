package org.example.chapter6.card;

public class ex3 {

    public static void main(String[] args) {

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.width = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", "  +c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", "  +c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", "  +c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", "  +c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");


        // 결과 값
        // c1은 Heart, 7이며, 크기는 (50, 80)
        // c2은 Spade, 4이며, 크기는 (50, 80)
        // width와 height를 공유하기에 c1과 c2 의 크기가 같음





    }
}
