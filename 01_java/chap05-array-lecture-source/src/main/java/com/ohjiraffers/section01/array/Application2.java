package com.ohjiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*배열의 사용 방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        *
        * 배열의 선언
        * 자료형[] 변수명;
        * 자료형 변수명[];
        *
        * */

        //선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.
        int[] iarr;
        char carr[];

        /*선언한 레퍼런스에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
        * 참조자료형(refrence type)이라고 한다.
        * */
//        iarr = new int[]; 크기를 지정해주지 않으면 에러 발생
        iarr = new int[5];
        carr = new char[10];

        //선언과 할당을 동시에 할 수 있다.
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        System.out.println("iarr : " + iarr); // 16진수 주소값 출력
        System.out.println("carr : " + carr);

        System.out.println("iarr2 = " + iarr2);
        System.out.println("carr2 = " + carr2);

        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("carr2의 길이 : " + carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        darr = new double[30];

        System.out.println("수정 후 darr의 hashCode : " + darr.hashCode());
        System.out.println("수정 후 darr의 길이 : " + darr.length);

        darr = null;

        /*null : 있는 것도 아니고 없는 것도 아닌 값
        * 한 번 할당한 배열은 지울 수 없다.
        * 다만 레퍼런스 변수를 null로 변경하여 더이상 주소를 참조할 수 없게 된 배열은
        * 일정 시간이 지난 후 heap의 old 영역으로 이동하여 GC(가비지컬렉터)가 삭제시킨다.
        * 한 번 찾아갈 수 있는 주소를 잃어버린 배열은 다시 참조 불가능하다.
        * NullPointException 발생
        *
        * */

        System.out.println("삭제 후 darr의 길이 : " + darr.length);
    }
}
