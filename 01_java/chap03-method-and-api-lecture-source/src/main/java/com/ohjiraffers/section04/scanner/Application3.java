package com.ohjiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*스캐너의 next메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력받을 때
        * 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열 입력받을 때
        * */
        Scanner sc = new Scanner(System.in);


        // 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
        System.out.println("문자열을 입력해주세요 : " );
        String str1 = sc.next(); //공백이나 개행문자 전까지를 읽어온다.
        System.out.println("str1 : " + str1);
//        System.out.println(sc.next());

        sc.nextLine(); //버퍼공간 잔류 데이터를 다 받고 공백을 준다(초기화).

        System.out.println("숫자를 입력해주세요 : " );
        int num1 = sc.nextInt();
        System.out.println("num1 : " + num1);

        //2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때
        System.out.println("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);
        //숫자를 쓰고 엔터를 치면 엔터값이 버퍼공간으로 간다.
        //nextLine()이 그 엔터값을 받아준다. 그래서 중간에 sc.nextLine()을 해주지 않으면
        //밑에  String str2 = sc.nextLine(); 는 바이패스 된다. 그래서 sc.nextLine(); 한번 해줘야함.

        sc.nextLine();
        System.out.println("문자열을 입력해주세요 : " );
        String str2 = sc.nextLine();
        System.out.println("str2 : "  + str2);

    }
}
