package com.ohjiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /*메소드의 파라미터에 대한 이해
        * -> 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달해서 호출할 수 있다.
        *
        * 매개변수(파라미터)로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        *
        * */

        ParameterTest pt = new ParameterTest();

        /*1. 기본자료형을 매개변수로 전달받는 메소드
        * 기본자료형 8가지 모두 가능하다.
        * */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /*2.기본자료형 배열을 매개변수로 전달받는 메소드*/
        int[] iarr = {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);

        pt.testPrimaryTypeParameter(iarr); //작성하고 action을 통해 ParameterTset에 메소드 자동완성기능으로 넘겨줌

        System.out.println("변경 후 원본배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        //주소값을 넘겨주고 다른 클래스(ParameterTest)에서 값 변경을 해줬더니 원본 배열의 값도 바뀐다.
        //같은 주소값의 배열을 받았기 때문에!

        /*3. 클래스 자료형 */

        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 :" + r1);
        pt.testClassTypeParameter(r1);

        /*5. 가변인자
        * 인자로 전달하는 값의 갯수가 정해지지 않는 경우에 가변배열을 활용할 수 있다.
        * */

        pt.testVariableLengthArrayParameter("홍길동"); //가변인자는 전달하지 않아도 된다.
        //이름 : 홍길동
        //취미의 갯수 : 0
        //취미 :
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
        pt.testVariableLengthArrayParameter("신사임당", new String[] {"볼링", "축구"});

    }
}
