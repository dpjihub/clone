package com.ohjiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*배열의 복사에는 크게 두가지 종류가 있다.
        * 1. 얕은 복사(Shallow copy) : stack의 주소값만 복사
        * 2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사
        *
        * 얕은 복사
        *
        * 얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        * 따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게되면
        * 다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.
        * */

        int[] originArr = {1, 2, 3, 4, 5}; //원본배열
        int[] copyArr = originArr;

        System.out.println("originArr.hashCod() : " + originArr.hashCode());
        System.out.println("copyArr.hashCod() : " + copyArr.hashCode());

        for(int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();

        copyArr[0] = 99;


        for(int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
    }
}
