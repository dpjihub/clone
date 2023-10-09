package com.ohjiraffers.section02.encapsulation.problem1;

public class Monster {

    String name; //몬스터의 이름
    int hp; //몬스터의 체력 //전역변수

    //전역변수와 매개변수의 이름을 맞춰준다(다르게 해도 되지만 보통 그렇게 한다).


    public void setHp(int hp) { //매개변수 이름이 hp 이다.
        //set 으로 시작하면 수정의 의미. get은 가져오는 의미. 지금은 필드변수를 수정하는 메소드라고 생각하면 된다.
        if (hp > 0) {
            /*this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            * 전역변수에 접근하기 위해서는 this.을 명시해야 한다.
            * */
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            System.out.println("this " + this.hashCode());
            this.hp = hp; //변수간에는 우선순위가 있다. 보통 안에 있는 지역변수가 우선수위.
            //생성한 주소값은 this에 담긴다. 생성될 때 내부적으로 구분. 인스턴스가 생성된 시점의 주소값을 담아준다.
        } else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}
