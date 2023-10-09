package com.ohjiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    /*자바빈(Java Bean)이란?
    * JSP(Java Server Page)에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바클래스이다.
    * html에 자바 코드를 입힐 수 있게 해주는 것 : JSP
    *
    * 자바 코드를 모르는 웹 퍼블리셔들도 자바 코드르 사용할 수 있도록
    * 태그 형식으로 지원하는 문법을 의미하는데, 그 때 사용할 수 있는 규칙을 지정해놓은
    * java클래스를 자바빈이라고 부른다.
    *
    * 지금은 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 된다.
    * */

    /*자바빈 작성 규칙
    * 1. 자바빈은 특정 패키지에 속해있어야 한다(default 패키지 사용금지). // package com.ohjiraffers.section04.dto; 이런게 있어야.
    * 2. 멤버변수의 접근제어자는 private로 선언해야한다.
    * 3. 기본생성자가 명시적으로 존재해야 한다(매개변수 있는 생성자는 선택사항).
    * 4. 모든 멤버변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 한다.
    * 5. 직렬화(Serializable 구현)가 되어 있어야 한다(선택사항).
    *
    *
    * com.ohgiraffers.project < - 반대로 돌린것. 웹사이트 naver.com 과 같다.
    * */

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*기본 생성자 명시적으로 작성
    * 매개변수 있는 생성자를 선택적으로 추가할 수 있도록 기본생성자를 명시한다.
    * (명시하지 않고 추후 매개변수 있는 생성자를 추가할 시 에러 발생 가능성이 있기 때문이다)*/
    public UserDTO() { //alt + insert -> contsructor -> select none
    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

//    public Date enrollDate(){
//
//    }
    //모든 필드의 값을 하나의 문자열로 반환하는 메소드를 필드값 확인용으로 많이 사용
    public String getInformation(){
        return "id = " + this.id +
                ", pwd + " +this.pwd +
                ", name = " +this.name +
                ", enrollDate = " + this.enrollDate;
    }
}
