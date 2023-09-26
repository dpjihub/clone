package com.ohjiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*java.util.Random 클래스를 활용하여 난수를 발생시키자.
        * 여러가지 정의되어있는 메소드들이 있는데
        * 그 중에서 nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수형태로 반환
        * */
        // 원하는 범위의 난수를 구하는 공식
        // random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
        Random random = new Random(); //객체 생성. 변수 선언과 비슷하다. int i = 0; 자료형 (참조)변수명 = (주소)값;

        //1. 0 ~ 9

        int randomNumber1 = random.nextInt(10);
        System.out.println("0~9까지의 난수 : " + randomNumber1);

        //2. 1 ~ 10

        int randomNumber2 = random.nextInt(10) + 1;

        System.out.println("1~10까지의 난수 : " + randomNumber2);

        //3. 20부터 45

        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("20~45까지의 난수 : " + randomNumber3);

        //4. -128부터 127
        int randomNumber4 = random.nextInt(256) + (-128);
        System.out.println("20~45까지의 난수 : " + randomNumber4);

        int randomNumber5 = new Random().nextInt(256) - 128; //선언하지 않고 이렇게 해도 위와 같다.

    }
}
