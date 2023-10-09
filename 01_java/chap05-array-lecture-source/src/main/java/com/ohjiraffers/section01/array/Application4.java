package com.ohjiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보자.*/

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + "번 째 학생의 자바 점수를 입력해주세요 : " ); //0번째부터 출력되므로 1번째로 변경해주기 위해 (i + 1)을 먼저 해준다.
            scores[i] = sc.nextInt();
        }

        //합계와 평균 구해보기

        double sum = 0.0;
        double avg = 0.0;

        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        avg = sum / scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
