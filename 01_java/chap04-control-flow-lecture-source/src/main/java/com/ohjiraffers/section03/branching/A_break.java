package com.ohjiraffers.section03.branching;

public class A_break {

    /*break문은 반복문 내에서 사용한다.
    * 해당 반복문을 빠져나올 때 사용하며, 반복문의 조건문 판단 결과와 상관 없이
    * 반복문을 빠져나올 때 사용한다.
    * (가장 가까운 반복문을 빠져나온다)
    * 일반적으로 if(조건식){
    * break;
    * }
    * 처럼 사용된다.
    * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
    * */

    /*break문을 이용하여 무한루프를 활용한 1~100까지 합계 구하기*/

    public void testSimpleBreakStatement(){

        int sum = 0;
        int i = 1;

        while(true) {
            //while문은 참일 때 계속 돌아간다. 그러므로 이렇게 명명하면 무한 루프가 된다.
            sum += i;

            if(i == 100){
                break; //break 를 달아주지 않으면 무한 루프이므로, 여기에 넣어준다.
            }
            i++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }

    public void testSimpleBreakStatement2(){

        /*break문은 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다.
        * */

        /*구구단 2 ~ 9단까지 출력
        * 단, 각 단의 수가 5보다 큰 경우 출력을 생략한다.
        * */
        for(int dan = 2; dan < 10; dan++){

            for(int su = 1; su < 10; su++){

                if(su > 5 ){
                    break;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testJumpBreak(){
        label:
        for(;;){
            // ';;' 이렇게 하면 무한하게 돈다.

            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3){
                    break label; //break는 가장 가까운 반복문만 멈추게 한다. 그렇기때문에
                                //이 경우 무한루프가 돌것이다. 그러나 for문에 이름을 붙여주고 break 그 이름으로 하면 멈추기 가능.

                    //return 은 현재 메소드를 종료하고 나간다.
                    //break은 현재의 반복문을 탈출한다. 해당 반복문만 나가니까 차이가 있다.
                }
            }
        }
    }

}
