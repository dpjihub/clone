package com.ohjiraffers.section04.constructor;

import java.util.Date;

public class User {
//필드
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; //이런 다른 클래스 자료형도 쓸수 있다(ex: String).

//    private Car car; //car에는 주소값이 담긴다.
    /*생성자의 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
    * */
    //기본생성자(default constructor)
    public User(){ //메소드와 비슷하지만 반환형이 없다. public void User(){} <-이렇게하면 메소드가 됨.
        System.out.println("User 클래스의 기본생성자 호출함...");
    }
    /*동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다(컴파일 에러).*/
//    public User(){}

    /*생성자 작성 방법
    * 표현식
    * 접근제한자 클래스명([매개변수]){ : optional. 반드시 매개변수를 작성해야 되는 것은 아님
    * 인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)->매개변수 있는 생성자를 이용해서.
    * 해당 객체를 생성할 때 초기에 뭔가를 같이 생성해서 사용하고 싶을 때
    * this.필드명 = 매개변수; ...
    * }
    *
    * 생성자 작성 시 주의할 점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다(대/소문자까지 같아야한다)
    * 2. 생성자 메소드는 반환형을 작성하지 않는다(작성하면 메소드로 인식한다).
    *
    * */

    /*매개변수 있는 생성자
    * 초기화할 필드가 여러 개인 경우, 초기화 하고 싶은 필드의 갯수별로 생성자를 여러개 준비해둘 수 있다.
    * */
    public User(String id, String pwd, String name){

        /*분명 동일한 이름의 생성자는 작성하지 못한다고 했는데 작성이 되었다.
        * 이건 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라
        * 동일한 생성자 혹은 메소드를 한 클래스내에 여러개 작성할 수 있게 만든 기술이다(오버로딩).*/
        this.id = id; // this는 인스턴스 생성 시점에 발생한 주소가 저장된다.
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        this(id, pwd, name); //위의 생성자를 참조한다.
        this.enrollDate = enrollDate;
        System.out.println("모든 필드를 초기화하는 생성자 호출됨...");

        /*this() 사용하기
        * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다(메소드와 동일함)
        * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
        * this()는 가장 첫줄에 선언해야 하며, 그렇지 않은 경우 Compile error가 발생한다.
        * */
    }
    //alt + insert로 constructor 선택 후 손쉽게 생성할 수도 있다.

    /*복사 생성자
    * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서
    * 새로운 인스턴스 생성 시 초기화값으로 이용할 수 있다.
    * 깊은 복사: 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다.
    * */
    public User(User othetUser){
//        this.id = othetUser.id;
//        this.pwd = othetUser.pwd;
//        this.name = othetUser.name;
//        this.enrollDate = othetUser.enrollDate;
        this(othetUser.id, othetUser.pwd, othetUser.name, othetUser.enrollDate);

        System.out.println("this의 hashCode : " + this.hashCode());
        System.out.println("otherUser의 hashCode : " + othetUser.hashCode());
    }

    public String getInformation(){
        return "Id = " + this.id +
                ", pwd = " + this.pwd +
                ", name = " + this.name +
                ", enrollDate = " + this.enrollDate;
    }
}
