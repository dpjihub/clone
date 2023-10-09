package com.ohjiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++; //인스턴스를 생성 후 사용 가능한 메소드이기 때문에 this에는 주소가 들어가 있다.
        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod(){
        //this.count++; 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this에는 주소가 들어가 있지 않다.
        System.out.println("staticMethod 호출됨...");
    }
}
