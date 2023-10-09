package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice7 {
    /*-영수증 가격 확인
첫째 줄에는 영수증에 적힌 총 금액이 주어진다. ->"총금액을 입력해주세요"
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 n이 주어진다. "물건 종류의 수를 입력해주세요"
이후
n개의 줄에는 각 물건의 가격 price와 개수 num이 공백을 사이에 두고 주어진다. "가격과 개수를 입력해주세요"
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
일치하지 않는다면 No를 출력한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총금액을 입력해주세요 : ");
        int total = sc.nextInt();

        System.out.print("물건 종류의 수를 입력해주세요 : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("가격을 입력해주세요 : ");
            int price = sc.nextInt();
            System.out.print("갯수를 입력해주세요 : ");
            int num = sc.nextInt();
            sum += price * num;

        }
        System.out.println(sum);

        if(total == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
