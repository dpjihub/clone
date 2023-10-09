package com.ohjiraffers.section02.encapsulation.problem3;

import com.ohjiraffers.section02.encapsulation.problem3.Monster;
public class Application {
    public static void main(String[] args) {
        
        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(100);

        System.out.println("monster1 = " + monster1.getInfo());
        System.out.println("monster2 = " + monster2.getInfo());
        System.out.println("monster3 = " + monster3.getInfo());
        
        //하지만 여전히 필드에 접근할 수도 있다.

        monster3.kinds = "두치";
        monster3.hp = -500;

        System.out.println("monster3.kinds = " + monster3.kinds);
        System.out.println("monster3.hp = " + monster3.hp);
    }
}
