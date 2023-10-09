package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        /*Hello World 문자열 입력하고
        * 1.l과 o 의 개수를 찾아서 출력
        * 2. 입력한 문자열의 문자가 어떤 게 몇 개 인지 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String inputStr = sc.next();
        char[] ch1 = new char[inputStr.length()];

        System.out.print("추출할 문자를 입력해주세요 : ");
        char ch2 = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < ch1.length; i++){
            if(ch2 == inputStr.charAt(i)){

            }
        }
    }
}
