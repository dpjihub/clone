package com.ohjiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /*메소드란
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * 스태틱 메소드, 일반 메소드로 나뉜다. 선언 방식, 생명 주기가 다름.
        * 퍼블릭: 접근제한자, 보이드: 반환형, 메소드명(){}
        * */

        /*메소드 호출 방법
        * 클래스명 사용할이름 = new 클래스명(); ->객체 생성
        * 사용할이름.메소드명(); ->클래스 안의 내용을 호출하여 사용한다.
        * */

        System.out.println("main() 시작됨");
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨");
    }

    public void methodA(){
        System.out.println("methodA() 호출함");
        methodB();
        System.out.println("methodA() 종료됨");
    }

    public void methodB(){
        System.out.println("methodB() 호출함");
        System.out.println("methodB() 종료됨");
    }
}
