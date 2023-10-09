package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        /*양의 짝수 정수를 입력하여 입력한 수 들의 합을 출력하고
        음의 정수나 홀수를 입력하면 "정수가 음수 이거나 홀수 입니다" 나오도록  출력하세요
        단, 양의 짝수의 합이 나올 때까지 반복하세요
                ==================================
        출력예시

        정수를 입력하세요 : 6
        6까지의 짝수들의 합 : 12
        정수를 입력하세요 : 3
        정수가 음수 이거나 홀수 입니다
        정수를 입력하세요 :

        정수를 입력하세요 : -5
        정수가 음수 이거나 홀수 입니다
        정수를 입력하세요 :
        */

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int result = 0;
        while(true) {
            System.out.print("양의 짝수 정수를 입력해주세요 : ");
            int inputNum = sc.nextInt();
            if (inputNum % 2 == 1 || inputNum < 0) {
                System.out.println("정수가 음수이거나 홀수입니다.");
            } else if (inputNum % 2 == 0) {

                for(int i = 1; i <= inputNum; i++){
                result = sum += i;
                    System.out.print(result+ " ");

                }
                System.out.println();

                if(sum % 2 == 0){

                    break;
                }
            }
        }
    }
}
