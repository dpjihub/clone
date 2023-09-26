package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*비교연산자
        * 비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        * */

        /*
         *  비교연산자의 종류
         *  '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
         *  '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
         *  '>'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
         *  '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
         *  '<'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
         *  '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
         * */
        // 정수 비교
        int inum1 = 10;
        int inum2 = 20;
        System.out.println("========= 정수값 비교 ==========");
        System.out.println(inum1 == inum2);
        System.out.println(inum1 != inum2);
        System.out.println(inum1 > inum2);
        System.out.println(inum1 >= inum2);
        System.out.println(inum1 < inum2);
        System.out.println(inum1 <= inum2);

        // 실수 비교
        double dnum1 = 10.0;
        double dnum2 = 20.0;
        System.out.println("========= 실수값 비교 ==========");
        System.out.println(dnum1 == dnum2);
        System.out.println(dnum1 != dnum2);
        System.out.println(dnum1 > dnum2);
        System.out.println(dnum1 >= dnum2);
        System.out.println(dnum1 < dnum2);
        System.out.println(dnum1 <= dnum2);

        /*문자값 비교*/
        char ch1 = 'a';
        char ch2 = 'A';
        int ch3 = 97;


        System.out.println("========= 문자값 비교 ==========");
        System.out.println(ch1 == ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 == ch3);


        /*문자열도 대소 비교는 불가능
        * 그런데 아래의 예시와 같은 때만 원하는 값을 찾을 수 있다.
        *
        * */
        System.out.println("========= 문자열값 비교 ==========");
        String s1 = "안녕";
        String s2 = "안녕하세요";
        String s3 = "안녕";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 != s2);

        /*논리값 비교
        *  == 와 !=은 비교 가능하지만 대소비교는 불가능하다.
        * */
        System.out.println("========= 논리값 비교 ==========");
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 == bool2);
        System.out.println(bool1 != bool2);
//        System.out.println(bool1 > bool2);
//        System.out.println(bool1 < bool2);

        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result :" + result);

    }
}
