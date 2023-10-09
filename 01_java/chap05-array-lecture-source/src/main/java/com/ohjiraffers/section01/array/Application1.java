package com.ohjiraffers.section01.array;

public class Application1 {

    /*배열이란?
    * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
    * 배열은 heap영역에 new 연산자를 이용하여 할당한다.
    *
    * 배열의 사용이유
    * 만약 배열을 사용하지 않는다면 변수를 여러개 사용해야 한다.
    * 1. 연속된 메모리 공간으로 관리할 수 있다(모든 변수의 이름을 사용자가 관리해야한다).
    * 2. 반복문을 이용한 연속처리가 불가능하다.
    *
    * 배열은 자료구조 중 정형화된 데이터에 해당한다. 정형화된 데이터랑 순차적으로 데이터가 쌓이는 형태를 말한다.
    * 순서대로 데이터를 쌓고 꺼낼 때 사용한다.
    * 비정형은 순서없이 저장하고 특정한 키값을 통해 데이터를 꺼내어 쓰는 데이터 형태를 말한다.
    *
    * */
    public static void main(String[] args) {

        //변수 5개에 값을 저장
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0; //변수에 값 저장하기 위한 용도의 번수

        sum += num1; // sum = sum + num1
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        //배열의 선언 및 할당

        int[] arr = new int[5]; //주소값[인덱스]

        arr[0] = 10; // arr[0] <-주소값의 0번째 인덱스를 참조한다.
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
    //String 길이를 구할 때 사용하는 메소드 : length();
        //배열의 길이를 구할 때는 length -> 필드변수
        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10;
        }

        System.out.println(arr[0]);
        
        int sum2 = 0;
        
        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println("sum2 = " + sum2);
        
        int sum3 = 0;
        
        for(int i = 0; i <arr.length; i++){
            sum3 += arr[i];
        }

        System.out.println("sum3 = " + sum3);
        
        
    }
}
