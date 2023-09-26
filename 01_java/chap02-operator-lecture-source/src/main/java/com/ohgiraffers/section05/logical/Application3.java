package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /*
        * AND연산과 OR연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
        * */

        int num1 = 10;
        //삼항연산자: (조건식)? 조건식의 결과가 참일 때 : 조건식의 결과가 거짓일 때
        int result1 = (false && ++num1 > 0)? num1 : num1;
        System.out.println(result1);
        //AND조건식은 false 일때 두 번째 조건을 실행하지 않으므로

        int num2 = 10;
        int result2 = (true || ++num2 > 0)? num2 : num2;
        System.out.println(result2);
    }
}
