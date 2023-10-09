package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            /*주사위 2개를 던져 각 눈의 값을 출력하는 프로그램을 만드시오.
            *
            *
            * 출력 예시:
            * "주사위 2개를 던지시겠습니까?(y/n)"
            * "첫번째 주사위의 눈은 4 이며 두번째 주사위의 눈은 2 입니다.
            *
            * "프로그램을 종료합니다."
            *
            * "잘못 입력하셨습니다."
            *
            *
            * 각 주사위의 값은 랜덤하게 나오도록 한다(6면체 주사위 기준).
            * y나 Y를 입력하면 주사위 던지기가 실행되게끔하고,
            * 다른 문자나 값이 들어오면 "잘못입력하셨습니다."를 출력하게 한다.
            * 프로그램을 종료할때까지(n 이나 N 을 입력하기 전까지) 계속해서 주사위를 던질지 물어보게 한다.
            * */
        while (true) {
            System.out.print("주사위 2개를 던지시겠습니까?(y/n)");
            String answer = sc.next();
            if(answer.equals("y") || answer.equals("Y")) {
                int first = (int) (Math.random() * 6) + 1;
                int second = (int) (Math.random() * 6) + 1;
                System.out.println("첫번째 주사위의 눈은 " + first + "이며 두번째 주사위의 눈은 " + second + "입니다.");
            } else if(answer.equals("n") || answer.equals("N")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
