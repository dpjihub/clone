package com.ohjiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){

    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int getStaticCount() {
        return staticCount;
    }

    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.staticCount++; //this도 가능하지만 static에 올라가 있는 것은 이미 클래스가 생성되어 있다. 그 클래스명을 사용해주자.

    }
}
