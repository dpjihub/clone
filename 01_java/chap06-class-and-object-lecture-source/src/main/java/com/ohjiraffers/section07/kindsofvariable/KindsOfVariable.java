package com.ohjiraffers.section07.kindsofvariable;

public class KindsOfVariable { //클래스 영역의 시작

    /*클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수)*/

    //non-static field를 인스턴스 변수라고도 한다(인스턴스가 생성 시점에 사용 가능한 변수라는 의미)
    private int globalNum;

    //static field를 정적필드(클래스변수)라고 한다. 정적(클래스) 영역에 생성되는 변수를 의미한다.
    private static int staticNum;

    public void testMethod(int num){ // 메소드 영역의 시작
        /*메소드 영역에서 작성하는 변수를 지역변수라고 한다.
        * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
        * 매개변수도 일종의 지역변수로 생각한다.
        * 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack에 생성된다.
        * */
        int localNum;
        localNum = 0; //메소드 영역에 변수를 선언할 때(지역변수)는 값을 초기화해주어야 한다.
        System.out.println(localNum);
        // 전역변수는 필드에서 생성할 때 바로 초기화가 된다.
        //지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 되어야한다.

        System.out.println(globalNum); //전역변수는 클래스 전역에서 사용가능하다.
        System.out.println(staticNum);

        System.out.println(num);
    } // 메소드 영역의 끝
    public void testMehod2(){
//        System.out.println(localNum); //지역변수는 선언한 지역을 벗어나면 사용불가. 해당지역(블럭)내에서만 사용가능.
        System.out.println(globalNum); //전역변수는 클래스 전역에서 사용가능하다.
        System.out.println(staticNum);

    }
} //클래스 영역의 끝
