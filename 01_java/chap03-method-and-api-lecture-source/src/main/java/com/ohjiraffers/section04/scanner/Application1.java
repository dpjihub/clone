package com.ohjiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*java.util.Scanner를 이용한 다양한 자료형 값 입력 받기
        *
        * 1. Scanner에 대한 객체 생성
        *
        * */
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        Scanner sc = new Scanner(System.in);

        /*2.자료형별 값 입력받기
        * 입력받을 때 안내문구는 별도로 출력해주지 않으니 우리가 직접 작성해주어야한다.
        * -->자주 하는 혼동상황
        * nextLin() : 입력받은 값을 문자열로 반환해준다.
        * */
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*정수형 값 입력 받기
        * nextInt() : 입력받은 값을 int형으로 반환한다.
        * 매개변수로 사용할 수 있는 radix는 진법을 지정할 수 있다.
        * 숫자가 아닌 값을 입력하게 되면 InputMissmatchException 오류
        * int 범위를 초과한 값을 입력받게 되면 역시 같은 오류 발생
        * */

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /*nextLong() : 입력받은 값을 long형으로 반환한다.*/

        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 : " + money + "원 입니다." );

        /*nextBoolean() : 입력받은 값을 boolean형으로 반환
        * true or false 외에 다른 값을 입력하면 InputMissmatchException 발생
        * */

        System.out.println("참과 거짓 중 한 가지를 true or false 로 입력해주세요.");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        /*문자형 값 입력받기
        * 문자를 직접 입력 받는 기능을 제공하지는 않는다.
        * 따라서 문자열로 입력을 받고 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야한다.
        * 그 때 사용하는 메소드가 java.lang.String에 있는 charAt(int index)를 사용한다.
        * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형으로 반환해주는 기능을 한다.
        * index는 0부터 시작하는 숫자체계이며 컴퓨터에서 주로 사용되는 방식이다.
        * 만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutBoundsException 발생.*/
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요.");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");



    }
}
