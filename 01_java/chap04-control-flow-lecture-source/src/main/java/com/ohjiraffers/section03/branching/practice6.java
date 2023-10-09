package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 코드를 작성하세요.

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 n을 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;


        }
        System.out.println(sum);

    }
}
