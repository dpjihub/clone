package com.ohjiraffers.section02.encapsulation.problem3;

public class Monster {

    String kinds;
    int hp;

    public void setInfo(String info){
        this.kinds = info;
    }
    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public String getInfo(){ //지역변수가 없으므로()<- this.를 생략해도 된다. 그러나 아래 코드는 명확하게 하기 위해 사용했다.
        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}
