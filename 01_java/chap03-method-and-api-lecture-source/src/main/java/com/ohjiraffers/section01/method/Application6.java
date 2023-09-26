package com.ohjiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드의 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        * 이 때 가지고 가는 값을 리턴값이라고 한다.
        *
        * 리턴값을 반환받기 위해서는 메소드 선언부에 리턴 타입을 명시해주어야 한다.
        * void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
        * 반환값이 없는 경우 return 구문은 생략해도 컴파일러가 자동으로 추가해주지만,
        * 반환값이 있는 경우 return 구문을 반드시 명시적으로 작성해야한다.
        *
        * 또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야한다.*/
        Application6 app6 = new Application6();
        app6.testMethod();

        //반환된 값(return의 helloworld)을 받으려면 변수를 선언해주어야 한다.
        String returnText = app6.testMethod();
        System.out.println(returnText);
        //또는 아래와 같이 바로 출력되게할 수도 있다.
        System.out.println(app6.testMethod());

    }

    public String testMethod(){ //메소드 반환값은 String. 값을 호출한 곳으로 반환을 할지 안할지 명시해야한다.

        /*void 반환타입이 아닌 경우는 반환타입에 맞는 값을 return구문에 명시를 해주어야한다.
        * */
        return "hello world";

    }
}
