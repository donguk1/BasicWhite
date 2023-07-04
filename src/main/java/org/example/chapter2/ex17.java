package org.example.chapter2;

public class ex17 {
    public static void main(String[] args) {

        String str = "3";
        char c;
        int a;

        a = str.charAt(0) - '0';
//        문자열을 숫자로 변환  문자에서 '0' 빼기
        System.out.println(str + " " + a);

        a = 4;

        str = a +"";
//        숫자를 문자열로 변환 숫자에 빈 문자열("") 더하기
        System.out.println(str + " " + a);

        c = (char) (a + '0');
//        숫자를 문자로 변환 숫자에 '0' 더하기
        System.out.println(c);








    }
}
