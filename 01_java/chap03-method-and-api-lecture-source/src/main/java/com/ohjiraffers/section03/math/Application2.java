package com.ohjiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /*난수의 활용
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 존재한다.
        * */

        /*원하는 범위의 난수를 구하는 공식
        * (int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        /*1. 0 ~ 9까지의 난수를 발생시키자.*/
        int random1 = (int) (Math.random() * 10);  //구하려는 난수 (0~9까지)의 갯수
        // 0.0 * 10 = 1.0, 1.0 * 10 = 10.0 => 0.0~9.999999~> int로 형변환하면 소수점 빠짐.
        //결론은 0 ~ 9 가 된다.

        System.out.println(random1);

        //2. 1 ~ 10까지의 난수 발생
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println(random2);

        //3. 10 ~ 15
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println(random3);

        //4. -128 ~ 127
        int random4 = (int) (Math.random() * 256) + (-128); // 127 - (-128)
        System.out.println(random4);


    }
}
