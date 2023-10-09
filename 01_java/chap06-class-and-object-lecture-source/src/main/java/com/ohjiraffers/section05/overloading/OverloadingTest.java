package com.ohjiraffers.section05.overloading;

public class OverloadingTest {
    /*오버로딩(Overloading)
    *
    * 오버로딩의 사용 이유
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
    * 이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우 어려울것이다.
    * 규모가 작은 프로그램의 경우는 정도가 덜하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
    * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해
    * 사용하는 기술을 오버로딩이라고 한다.
    *
    * 오버로딩의 조건
    * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
    * 한 클래스 내에 동일한 이름의 메소드를 여러개 작성할 수 있도록 한다.
    *
    * 메소드의 시그니쳐(signature)가 다르면 다른 메소드로 인식하기 때문이다.
    * 즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
    *
    * 메소드의 시그니쳐
    * public void method(int num) {}
    * --> method(int num) 이부분이 시그니쳐
    * */

    public void test() {

    }

//    public void test(){
//
//    }
    //메소드의 시그니쳐가 동일하여 compile error 발생

//    private void test(){
//
//    }
    //접근제한자에 따른 오버로딩 성립확인 : 접근제한자는 메소드 시그니쳐에 해당하지 않는다.

//    public int test(){
//        return 0;
//    }
    //반환형에 따른 오버로딩 성립확인 : 반환형은 메소드 시그니쳐에 해당하지 않는다.

    public void test(int num){

    }
    //파라미터 선언부는 시그니쳐에 해당하므로 이렇게는 작성이 가능하다.

//    public void test(int num2){
//
//    }
    //매개변수의 이름은 메소드 시그니쳐에 영향을 주지 않는다. 에러.

    public void test(int num1, int num2){

    }

    //매개변수의 갯수가 다르므로 성립

    public void test(int num, String name){

    }
    //갯수는 같지만 타입이 다르므로 성립

    public void test(String name, int num) {

    }
    //위와 같아보이지만 순서가 다르므로 성립

    //매개변수 타입, 갯수, 순서가 다르면 다르게 인지하는 것이 오버로딩이다.


}
