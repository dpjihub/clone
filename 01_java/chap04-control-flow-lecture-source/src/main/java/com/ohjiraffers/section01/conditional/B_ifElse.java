package com.ohjiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    /*
    * if-else문 표현식
    * if (조건식) {
    * 조건식이 true일 때 실행할 명령문;
    * } else {
    * 조건식이 false일 때 실행할 명령문;
    * }
    *
    * if문은 조건식의 결과 값이 참이면 if {} 안에 있는 코드를 실행하고,
    * 조건식의 결과 겂이 거짓이면 else{} 안에 있는 코드를 실행한다.
    * */

    public void testSimpleIfElseStatement(){
        /*정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."
        * 홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램 작성.
        * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료하니다" 출력*/

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1개 입력해주세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 1){
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else{
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void testNestedIfElseStatement(){
        /*중첩된 if-else문 실행 흐름 확인
        * if-else문 안에서 또다른 조건을 사용하여 if-else문 사용가능
        * */

        /*숫자 하나 입력 받아 양수이면 "입력받은 숫자는 양수입니다."
        * 음수이면 "입력받은 숫자는 음수입니다."
        * 단, 0이면 "0입니다."
        * */
//        Scanner sc2 = new Scanner(System.in)
//        System.out.println("숫자 1개 입력해주세요: ");
//        int num2 = sc2.nextInt();
//
//        if(num2 != 0){
//            if(num2 > 0){
//            System.out.println("양수입니다.");}
//         else {
//                System.out.println("음수입니다");
//            } else {
//            System.out.println("0입니다.");
        }
    }

