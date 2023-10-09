package com.ohjiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {
        /*자료형 변수명
            int   i
        Member member
        클래스 레퍼런스 변수 = new 클래스명(); <-이전까진 이렇게 사용했지만,

        클래스 레퍼런스 변수 = new 생성자();
        () -> 메소드 new 뒤에 클래스명은 사실상 생성자(Constructor)라 불리는 메소드를 호출하는 구문이다.
        기본값을 채워서(int의 경우 0) 객체를 heap 공간에 생성해주기 때문에 생성자라고 할 수 있다.
        생성자란?
        인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        생성자 함수의 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        기본 생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
        기본 생성자를 이용해서 인스턴스를 생성하게 되면 자바에서는 자료형별 초기값을 이용해서 필드를 초기화
        필드 초기값을 사용자가 원하는대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달해서 호출할 수 있다.
        이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 매개변수 있는 생성자라고 한다.
        하지만 매개변수 있는 생성자가 한 개라도 존재하는 경우 compiler는 기본생성자를 자동으로 추가해주지 않으니
        사용 시 주의해야 한다.
        * */


        User user1 = new User();
        System.out.println(user1.getInformation());
        System.out.println();
        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());
        /*public User(String id, String pwd, String name){

            this.id = id;
            this.pwd = pwd;
            this.name = name;
             }*/ //를 호출한다.

        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());

        User user4 = new User(user3);
        System.out.println(user4.getInformation());//아래를 호출하는데, 유저 타입을 인자로 넣어주면 된다.

//            public User(User othetUser){ //타입이 User 이다.
//            this.id = othetUser.id;
//            this.pwd = othetUser.pwd;
//            this.name = othetUser.name;
//            this.enrollDate = othetUser.enrollDate;
//
//            System.out.println("this의 hashCode : " + this.hashCode());
//            System.out.println("otherUser의 hashCode : " + othetUser.hashCode());
//        }
    }

}
