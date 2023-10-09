package com.ohjiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        /*1번 몬스터 생성*/
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);
        monster1.setHp(300);
        System.out.println("monster1의 hashCode : " + monster1.hashCode());
        
        /*2번 몬스터 생성*/
        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        monster2.setHp(300);
        System.out.println("monster2의 hashCode : " + monster2.hashCode());
        
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
        
        Monster monster4 = new Monster();
        monster4.name = "드라큘라";
        monster4.setHp(-1000);
        /*출력을 해보면 음수가 더이상 나오지 않게 된다.
        * 이렇게 잘못된 값을 검증하여 필드값을 수정하는 기능으로 위에서 발생한 문제를 해결하였다.
        * */
        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
    }
}
