package com.ohjiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*문자열을 입력받는 두개의 메소드가 있는데 두 개의 차이점을 확인
        *
        * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다(공백문자 포함).
        * next() : 공백 문자나 개행문자 전까지를 읽어서 문자열로 반환한다(공백문자 포함하지 않는다).
        * 컴퓨터는 버퍼공간에 \n (개행문자)가 들어오기전까지 입력받는다.
        *
        * */

        Scanner sc = new Scanner(System.in);
//        System.out.print("인사말을 입력해주세요 : ");
//        String greeting1 = sc.nextLine();
//        System.out.println(greeting1);

        System.out.println("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);
        System.out.println(sc.next());
        //여기서 알 수 있는 것은, 입력받기 전에 버퍼공간을 먼저 처리한다는 것.
        //버퍼에는 앞 선 입력을 받았을 때 ('안녕하세요 반갑습니다') 버퍼공간에는 '반갑습니다'가 남아있다.

    }

}
