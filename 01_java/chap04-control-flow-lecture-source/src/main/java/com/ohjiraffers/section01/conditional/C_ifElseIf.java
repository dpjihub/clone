package com.ohjiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    //if      -> 1개 참일때만 실행
    //if else -> 1개 참일때 실행할 내용/거짓일때 실행

    /*if else if문 표현식
    * if(조건식1){
    * 조건식1이 true 일 때 실행할 명령문;
    * } else if(조건식2) {
    * 조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
    * } else {
    * 위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
    * }
    * if-else-if문은 조건식1의 결과값이 참이면 if{} 안에 있는 코드를 실행하고
    * 조건식1이 false이면 조건식2를 확인하여 참이면 else if{} 안에 있는 코드를 실행한다.
    * 조건식1,2의 결과값이 모두 거짓이면 else {}안에 있는 코드를 실행한다.
    *
    * */

    public void testSimpleIfElseStatement(){
        System.out.println("나무꾼 산신령 우화");
        System.out.println("금도끼, 은도끼, 쇠도끼");

        Scanner sc = new Scanner(System.in);
        System.out.print("어느 도끼가 너의 도끼니? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        int answer = sc.nextInt();
        System.out.println("answer = " + answer);

        if(answer == 1){
            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나.");
        } else if(answer == 2){
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나.");
        } else {
            System.out.println("오호 정직하구나. 여기 있는 금도끼, 은도끼, 쇠도끼 모두 다 가져가거라.");

        }
        System.out.println("그렇게 산신령은 다시 연못속으로 사라지고 말았다.");
    }

    public void testNestedIfElseStatement(){
        /*
         *  ohgiraffers 대학의 유xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        //학생의 등급을 저장하기 위한 변수 초기화

//        if(point > 0) {
//            String result = "A"; //여기에서 쓰고 끝낼거면 이렇게 기재
//        }
//        String result = "";
//        if(point > 0) {
//            result = "A";
//        }
        String grade = "";
        if(point >= 90) {
            grade = "A";

            if(point >= 95) {
                grade += "+"; //grade = grade + "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if(point >= 85) {
                grade += "+"; //grade = grade + "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if(point >= 75) {
                grade += "+"; //grade = grade + "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if(point >= 65) {
                grade += "+"; //grade = grade + "+";
            }
        } else {
            grade = "F";
        }




    }

}
