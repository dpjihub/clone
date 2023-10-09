package com.ohjiraffers.section03.branching;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        /* 두 개의 정수를 입력 받아 변수에 저장 후
         * 연산 기호 (+, -, *, /, %)를 입력받아 두 개의 입력받은 정수의 연산 수행 결과가
         * 짝수면 짝수다 홀수면 홀수다를 출력하세요
         * 단 , 준비된 연산기호 외 문자 입력 시 "입력한 연산기호는 수행불가합니다"를 출력하세요*/

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : " );
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : " );
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력해주세요 (+, -, *, /, %) : " );
        String op = sc.next();

        int result = 0;

        if(op.equals("+")){
            result = first + second;

        }else if(op.equals("-")){
            result = first - second;
        }else if(op.equals("*")){
            result = first * second;
        }else if(op.equals("/")){
            result = first / second;
        }else if(op.equals("%")){
            result = first % second;
        }else{
            System.out.println("입력한 연산 기호는 수행 불가합니다.");
        }

        if (result % 2 == 0){
            System.out.println("결과는 짝수입니다.");
        }else{
            System.out.println("결과는 홀수입니다.");
        }


    }




}
