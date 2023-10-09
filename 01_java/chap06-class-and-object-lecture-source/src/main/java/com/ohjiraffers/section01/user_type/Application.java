package com.ohjiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {


        //변수를 이용해서 회원데이터 관리

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        for(String h : hobby) {

            System.out.print(h + " ");
        }
        System.out.println();

        /*위의 코드들과 같이 각각의 변수로 관리하게 되면 여러가지 단점이 있다.
        * 1. 변수명을 다 관리해야 하는 어려움이 있다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
        *  너무 많은 값들을 인자로 전달해서 한 눈에 안들어 온다.
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다(서로 다른 자료형이기 때문에).
        *
        * 그래서 자바에서는 서로 다른 자료형의 데이터를 사용자(개발자)정의로 하나로 묶어서
        * 새로운 타입을 정의할 수 있는 방법을 제공해준다. 필요로 하는 자료형이 추가로 존재하는 경우
        * 자바에서는 클래스라는 매커니즘을 이용해서 사용자 정의와 자료형을 만들 수 있게 한다.
        */


        /*사용자 정의의 자료형인 클래스를 이용하기 위해서는
        * new 연산자로 heap에 할당을 해야한다. new 키워드를 사용할때마다 새롭게 공간을 만든다.
        * 인스턴스화 한다(일반클래스가 객체로 바뀌는 현상).
        * new 키워드로 인해 heap에 자리를 잡은 변수들을 인스턴스 변수라고 한다.
        *
        * 사용자정의자료형(클래스명) 변수명 = new 클래스명();
        * */
        Member member = new Member(); //객체 생성

        /*필드에 접근하기 위해서는 레퍼런스 변수명, 필드명으로 접근한다.
        * '.'은 참조연산자라고 하는데 레퍼런스변수에 참조하고 있는 주소로 접근한다는 의미를 가진다.
        * 각 공간은 필드명으로 접근한다(배열은 인덱스로 접근, 객체는 필드명으로 접근한다).
        *
        * 객체를 생성하고나면 서로다른 자료형들을 하나의 member라는 이름으로 관리할 수 있도록
        * 공간을 생성한 것이며 heap공간에 생성되기 때문에 jvm이 각 필드에 맞는 기본값으로 초기화를 해준다.
        * */
        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);

        member.id = "user01";
        member.pwd = "pass01";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};


        System.out.println("변경후 member.id : " + member.id);
        System.out.println("변경후 member.pwd : " + member.pwd);
        System.out.println("변경후 member.name : " + member.name);
        System.out.println("변경후 member.age : " + member.age);
        System.out.println("변경후 member.gender : " + member.gender);
        System.out.print("변경후 member.hobby : ");
        for(String str : member.hobby){
            System.out.print(str + " ");
        }
        System.out.println();







    }
}
