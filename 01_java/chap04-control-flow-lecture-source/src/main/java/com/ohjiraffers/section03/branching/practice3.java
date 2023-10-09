package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        /*자판기에서 원하는 음료를 뽑으려고 합니다

사이다 = 1100원
콜라 = 1200원
웰치스 = 1400원

가진돈은 2천원 입니다. 선택한 음료와 거스름돈을 출력하세요.

----------------------------
출력 예시

콜라를 선택하셨습니다 거스름돈은 800원 입니다.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("음료를 선택해주세요(사이다, 콜라, 웰치스) : ");
        String selectDrink = sc.next();


        int myMoney = 2000;
        int sprite = 1100;
        int cola = 1200;
        int welchs = 1400;

        int result = 0;
        String order = "";

        switch (selectDrink){
            case "사이다" :
                order = "사이다";
                result = myMoney - sprite;
                break;
            case "콜라" :
                order = "콜라";
                result = myMoney - cola;
                break;
            case "웰치스" :
                order = "웰치스";
                result = myMoney - welchs;
                break;

        }

        System.out.println( order + "를 선택하셨습니다. 거스름돈은 " + result + "입니다");



    }
}
