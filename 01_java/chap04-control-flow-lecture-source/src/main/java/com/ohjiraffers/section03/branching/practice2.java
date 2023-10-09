package com.ohjiraffers.section03.branching;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        /*
         * 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
         * 단, 해당프로그램을 시작할 때, 시작할지 종료할지를 물어보고 "go"를 입력하면 "시작하겠습니다."를 출력하고 연산 진행
         * "exit"를 입력하면 "프로그램을 종료하겠습니다"를 출력한 뒤 무한반복을 종료합니다.
         * 또한 계산의 결과가 짝수가 나올경우, "짝수가 나왔습니다"를 출력하고, 홀수가 나올경우 "홀수가 나왔습니다"를 출력한 뒤 처음으로 돌아가
         * 다시 연산을 시작할지 종료할지 물어보세요.
         *
         *
         * */
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.print("시작하시려면 go, 종료하시려면 exit를 입력해주세요.");
            String answer = sc.next();
            if(answer.equals("go")) {
                System.out.print("첫 번째 정수를 입력하세요 : ");
                int first = sc.nextInt();
                System.out.print("두 번째 정수를 입력하세요 : ");
                int second = sc.nextInt();
                System.out.print("연산 기호를 입력해주세요(+, -, *, /, %) : ");
                String op = sc.next();



                switch(op){
                    case "+" :
                        result = first + second;
                        break;

                    case "-" :
                        result = first - second;
                        break;

                    case "*" :
                        result = first * second;
                        break;

                    case "/" :
                        result = first / second;
                        break;

                    case "%" :
                        result = first % second;
                        break;

                }

                if(result % 2 == 0){
                    System.out.println("짝수가 나왔습니다.");
                    System.out.println("계속하시겠습니까?");

                } else{
                    System.out.println("홀수가 나왔습니다.");
                    System.out.println("계속하시겠습니까?");

                }

            } else if(answer.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
