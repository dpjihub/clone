package com.ohjiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /*전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * 변수의 종류
        * 1. 지역변수 예 : main{}
        * 2. 매개변수 예 : (String[] args)
        * 3. 전역변수(필드) 예 :
        * 4. 클래스(static)변수 예 :
        *
        * 지역변수는 선언한 메소드 블럭내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달인자를 받기 위해
        * 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */

        Application3 app3 = new Application3();
        /*호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 갯수, 순서가 일치하게 값을 넣어 호출해야함.*/
        app3.testMethod(40); //매개변수에 전달할 인자 40을 넣은 상태
//        app3.testMethod("40"); //매개변수는 int형이지만 인자가 String이기 때문에 호출할 수 없다.
//        app3.testMethod(20, 30, 40); //매개변수는 int형 1개 이지만 인자는 3개이기 때문에 호출할 수 없다.
//        app3.testMethod(); //매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출할 수 없다.
        /*변수에 저장한 값 전달 테스트*/
        int age = 20;
        app3.testMethod(age); //변수 선언 후 변수명 대입도 가능하다.

        /*자동형변환을 이용하여 값 전달을 할 수 있다.*/
        byte byteAge = 10;
        app3.testMethod(byteAge); //byte형을 int에 넣었으므로 정상동작. testMethod가 int형

        /*강제형변환을 이용해서 값 전달을 할 수 있다.*/
        long longAge = 80;
        app3.testMethod((int)longAge); //testMethod가 int형이므로 형변환 후 대입.
        /*연산결과를 이용해서 값 전달을 할 수 있다.*/
        app3.testMethod(age*3);

    }
    public void testMethod(int age) { //정수형 값을 받기 위해 age라는 매개변수를 선언
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }


}
