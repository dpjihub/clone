package com.ohjiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main()시작됨");

        Application1 app1 = new Application1();
        app1.methodA();

//        Application2 app2 = new Application2();
//        app2.methodA();
//        app2.methodB();
//        app2.methodC();

        System.out.println("main()종료됨 App2");
    }
    public void methodA(){
        System.out.println("methodA() 호출함");
        System.out.println("methodA() 종료함");
    }
    public void methodB(){
        System.out.println("methodB() 호출함");
        System.out.println("methodB() 종료함");
    }
    public void methodC(){
        System.out.println("methodC() 호출함");
        System.out.println("methodC() 종료함");
    }
}
