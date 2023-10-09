package com.ohjiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달받은 값 : " + num);
    }
    /*배열의 주소가 전달된다.
    * 즉, 인자로 전달하는 배열과 매개변수로 전달받은 배열은
    * 서로 동일한 배열을 가리킨다(얕은 복사).*/
    public void testPrimaryTypeParameter(int[] iarr) {
        System.out.println("매개변수로 전달받은 값 : " + iarr);
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle) {

        /*rectAngle에는 인스턴스의 주소가 전달된다.
        * 즉, 인자로 전달하는 인스턴스와 전달받은 인스턴스는 서로 동일한 인스턴스를 가리킨다(얕은 복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);
        System.out.println("변경 전 사각형의 넓이와 둘레 ==============");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100); //자동형변환 적용됨
        rectAngle.setHeight(100);

        System.out.println("변경 후 사각형의 넓이와 둘레 ==============");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }
    //가변배열은 [] 대신 ...을 사용한다.
    public void testVariableLengthArrayParameter(String name, String...hobby) {
        /*가변 길이의 배열은 몇 개가 매개변수로 전달될지 모르는 상황이기에
         * 이름과 구분하기 위해 뒤쪽에 작성해야한다.
         * 앞쪽에 작성하는 경우 에러 발생. (String...hobby, String name) 순서는 안됨.
         * */
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }

        /*오버라이딩 시 주의해야 한다.*/
//    public void testVariableLengthArrayParameter(String...hobby){
//
//        System.out.println("취미의 갯수 : " + hobby.length);
//        System.out.print("취미 : ");
//        for(int i = 0; i < hobby.length; i++){
//            System.out.print(hobby[i] + " ");
//        }
//        System.out.println();
//  }
    }



