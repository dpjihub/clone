package com.ohjiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    /*for문 안에 for문을 이용할 수 있다.*/

    public void printGugudanFromTwoToNine(){
        /*2단부터 단을 1씩 증가시키는 반복문*/
        for(int dan = 2; dan <= 9; dan++){

            for(int su = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(); // 1번의 반복이 끝날 때마다 줄바꿈을 위해.
        }
    }

    public void printUpradeGugudanFromTwoNine(){
        for(int dan = 2; dan <= 9; dan++){
            printGugudanOf(dan);
            System.out.println(); // 1번의 반복이 끝날 때마다 줄바꿈을 위해.
        }
    }
    public void printGugudanOf(int dan){
        for(int su = 1; su <= 9; su++){
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes() {
        //키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*"를 5개씩 출력하세요.

        //*****
        //*****
        //*****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        //입력한 행 만큼 반복 : i는 1부터 시작하고, 입력받은 row만큼 1씩 증감시킨다.
        for(int i = 1; i <= row; i++){

//            System.out.println("*");
//            System.out.print("*");

            for(int j = 1; j < 6; j++){
                System.out.print("*"); //*****
            }
            System.out.println();
        }
    }
    public void printTriangleStars(){
        //키보드로 정수를 입력받아 해당 정수만큼 한 행에 "*"행의 번호개씩 출력하세요.

        /*정수를 입력하세요 : 5
        * *
        * **
        * ***
        * ****
        * *****
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
