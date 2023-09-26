package com.ohjiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /*API란?
        * Application Programming Interface는 응용프로그램에서 사용할 수 있도록
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 구현하기 번거롭거나 자주 사용하는 내용들을 jdk 내부에서 이미 작성(구현)해둔 것
        *
        *
        * java.lang.Math
        * Math클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
        * */

        //절대값 출력

        System.out.println("-7의 절대값은 : " + (java.lang.Math.abs(-7)));
        //Math 클래스는 static 이므로 호출할 때 클래스명을 써주자.

        System.out.println(Math.abs(-1.25));

        //java.lang 패키지에 포함된 클래스이면 import를 따로하지 않고 사용할 수 있다.
        //컴파일러가 import java.lang.*;을 추가해서 컴파일한다.

        System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));

        System.out.println("원주율 : " + Math.PI);

        /*난수 출력(변하는 값, 랜덤한 값)
        * 0.0 부터 1.0 이전까지의 실수형태의 난수를 발생시킨다.
        * 호출할때마다 다른 값을 가진다.
        * */
        System.out.println("난수발생 : " + Math.random());

    }
}
