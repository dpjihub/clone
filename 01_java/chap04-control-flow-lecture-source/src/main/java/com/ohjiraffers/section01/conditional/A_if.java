package com.ohjiraffers.section01.conditional;

import java.util.Scanner;

//기능용 클래스
public class A_if {

        //실행용 클래스 -> main()메소드만
        //기능용 클래스 -> 기능형 메소드만

    /*if문 단독 사용에 대한 흐름
    * [if문 표현식]
    * if(조건식){
    * 조건식이 참일 때 실행할 명령문:
    * }
    *
    * 조건식: 반드시 true or false가 나오는 연산식을 조건식이라고 한다.
    *
    * if문은 조건식의 결과값이 참이면 {}안에 있는 코드를 실행하고,
    * 조건식의 결과값이 거짓이면 {}안에 있는 코드를 무시하고 넘어간다.
    * */

    public void testSimpleIfStatement(){
        //정수 한개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고
        //짝수가 아니면 출력하지 않는 구문을 작성해보자.
        //단, 조건과 상관없이 프로그램이 종료된 때 "프로그램을 종료합니다." 라고 출력되도록 한다.

        //일단 분석: 내가 받아야 될 것, 선언해야 될 것, 구현하면 어떤 값을 받아야 하는지,
        //정수 한 개를 입력 받아 : Scanner를 사용해야겠군.
        //그 수가 : int 형태로 받아야 겠군.
        //짝수면 : 조건.
        //"입력하신 숫자는 짝수입니다." 출력 : 출력문.
        //짝수가 아니면 출력하지 않는 구문: 아무것도 넣지 않으면 됨.
        //조건에 상관없이 프로그램이 종료할 때 출력 : 출력문.

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement(){
        //중첩된 if문
        //if문 안에서 또 다른 조건을 사용해서 if문을 사용할 수 있다.

        /*정수 한개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고
        * 둘중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자.
        * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        * */

        Scanner sc1 = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하시오.");
        int num2 = sc1.nextInt();

        //양수인 경우 확인
        if(num2 > 0){
            if(num2 % 2 == 0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }



}
