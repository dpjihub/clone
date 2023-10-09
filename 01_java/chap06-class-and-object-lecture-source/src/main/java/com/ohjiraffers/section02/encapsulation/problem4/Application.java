package com.ohjiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /*접근제한자에 대해서 알아보자.
        * */
        //필드에 직접 접근을 시도
        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인"; //컴파일 에러 발생 private 이라서 직접 접근할 수 없다.

/*선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
public으로 접근을 허용한 메소드만 허용할 수 있도록 해놓은 것이다.
이것을 캡슐화라고 부른다.
* */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
        * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
        * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용되고 있다.
        * */
    }
}
