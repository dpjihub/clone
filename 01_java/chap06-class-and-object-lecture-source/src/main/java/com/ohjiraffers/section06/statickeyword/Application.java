package com.ohjiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {
        /*static
        * :정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
        * 명확한 목적이 존재하지 않는 이상 static 키워드의 사용은 자제하자.
        * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
        * */

        StaticFieldTest sft1 = new StaticFieldTest();
        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("non-static field : " + sft2.getNonStaticCount()); //호출할때마다 초기화를 해서 기본값 0이 됨.
        System.out.println("static field : " + sft2.getStaticCount()); //기존에 1증가시켰던 값이 유지된다.

        /*인스턴스 변수의 경우에는 sft1과 sft2 두개의 인스턴스가 서로 값을 공유하지 못하고
        * 인스턴스 생성할 때 마다 0으로 초기화 되었다.
        * 하지만 static 필드의 경우에는 클래스변수 자체가 프로그램을 종료할 때까지 유지되고 있기때문에
        * 값을 유지하고 있다. 따라서 여러개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
        * */

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /*주의사항
        * static 메소드도 이렇게 호출은 할 수 있다.
        * 하지만 static 메소드의 경우에는 인스턴스를 생성하지 않고
        * 호출하는 방식으로 사용해야한다.
        * static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
        * static 메소드를 호출하는 방식으로 호출해야한다.*/
        smt.staticMethod(); //권장하지 않음

        StaticMethodTest.staticMethod(); //권장함
    }
}
