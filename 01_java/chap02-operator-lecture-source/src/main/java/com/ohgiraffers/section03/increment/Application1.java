package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /*증감연산자에 대한 이해
        * 증감연산자
        * 피연산자 앞 또는 뒤에 사용이 가능하다.
        * '++' 1 증가
        * '--' 1 감소
        * */
        int num = 20;
        num++;
        System.out.println("num : " + num);
        ++num;
        System.out.println("num : " + num);

        num--;
        System.out.println("num : " + num);
        --num;
        System.out.println("num : " + num);

        //증감연산자를 다른 연산자와 함께 사용

        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        // ++var : 피연산자를 먼저 1 증가시키고 연산
        // var++ : 연산을 하고 난 이후에 마지막에 1을 증가시킨다.

        int second = 20;
        int result2 = ++second * 3;
        System.out.println("result2 : " + result2);
        System.out.println("second : " + second);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);
        //모든 연산 뒤에 증가시켜준다. 대입연산자도 연산. 11이지만 대입연산자까지 하고 +1해주기때문.

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++); //a: 10(11), b: 20, c:30
        System.out.println((++a) + (b++)); // a: 12(12), b: 20
        System.out.println((a++) + (--b) + (--c)); // 12(13), 20(20), 29(29) = 61
        System.out.println(a + " " + b +" " + c);


    }
}
