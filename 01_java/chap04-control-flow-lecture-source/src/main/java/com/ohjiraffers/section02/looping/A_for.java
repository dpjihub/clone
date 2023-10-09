package com.ohjiraffers.section02.looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class A_for {
    /*
    * for문 표현식
    * for(초기식; 조건식; 증감식) {
    * 조건을 만족하는 경우 수행할 구문(반복할 구문);
    * }
    *
    * 기본 반복문을 이용해서 조금씩 바꿔가면서 문법에 적응해야한다.
    * 1. 증감식이 없는 경우
    * 2. 조건식이 없는 경우
    * 3. 초기식, 조건식, 증감식이 없는 경우
    * 4. 초기식, 조건식, 증감식 등을 변경하고 실행 값 예측해보기
    * 5. 역순으로 반복문 실행 등등 필요에 따라 더 기본 반복문을 변형해가면서 테스트를 해보자
    * */
    public void testSimpleForStatement() {
        //1.부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample1(){
        //무엇을 반복하는지를 확인하여 반복문으로 개선
        //10명의 학생 이름을 입력 받아 이름을 출력해보자.
        Scanner sc = new Scanner(System.in);

//        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
//        String student4 = sc.nextLine();
//        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
//
//        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
//        String student6 = sc.nextLine();
//        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
//
//        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
//        String student7 = sc.nextLine();
//        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
//        String student8 = sc.nextLine();
//        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
//        String student9 = sc.nextLine();
//        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
//        String student10 = sc.nextLine();
//        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//
//        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /*반복해야 하는 내용
        * 1. 안내문구 출력
        * 2. 학생 이름 입력 받아 변수에 저장
        * 3. 저장할 이름을 출력
        * 반복횟수는 1부터 10까지
        * 1씩 증가
        * */

        for(int i = 1; i <= 10; i++){
            System.out.print(i + "번째 학생 이름을 입력해주세요.");
            String student = sc.next();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");


    }
    public void testForExample2(){
        //1 ~ 10까지의 합계를 구하시오.
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int a6 = 6;
        int a7 = 7;
        int a8 = 8;
        int a9 = 9;
        int a10 = 10;

        int sum = 0;

        sum += a1;
        sum += a2;
        sum += a3;
        sum += a4;
        sum += a5;
        sum += a6;
        sum += a7;
        sum += a8;
        sum += a9;
        sum += a10;

        System.out.println("sum = " + sum);

        /*반복해야할 내용
        * 1. 변수에 1씩 증가하는 값 담기
        * 2. 저장된 값을 sum에 누적
        * 반복횟수 1부터 10까지
        * 1씩 증가(10번 반복)
        * */

        int sum2 = 0;

        for(int i = 1; i <= 10; i++){
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);

    }
    public void testForExample3(){
        //5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구하세요.

        int random = (int) (Math.random() * 6 ) + 5;
        System.out.println("random = " + random);

        int sum = 0;

        if(random == 5){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 7;
        } else if (random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 7;
            sum += 8;

        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 7;
            sum += 8;
            sum += 9;

        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum);

        int sum2 = 0;
        for(int i = 1; i <= random; i++){
            sum2 += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum2);

    }

    public void testForExample4(){
        /*숫자 두개를 입력받아 작은 수에서 큰 수까지의 합계를 구하세요.
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결본다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        int sum = 0;
        if(first > second){
            for(int i = second; i <= first; i++){
                sum += i;

            }
        } else {
            for(int i = first; i <= second; i++){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

        /*결국은 작은 수부터 큰 수까지의 합계를 구하는 것이니
         * first와 second중 어느 것이 더 큰 수인지를 확인*/
        int min = 0;
        int max = 0;
        int sum2 = 0;
        if(first > second){
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }
        for(int i = min; i <= max; i++){
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);
    }

    public void testForExample5(){
        /*키보드로 2 ~ 9 사이의 구구단을 입력받아
        * 2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고
        * 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력*/

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단수를 입력해주세요: ");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9 ){

//            System.out.println(dan + " * " + 1 + " = " + (dan * 1));
            for(int su = 1; su <= 9; su++ ){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

}
