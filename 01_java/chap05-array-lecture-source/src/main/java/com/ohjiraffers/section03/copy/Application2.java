package com.ohjiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {

        /*얕은 복사의 활용
        * 얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용된다.
        * */

        String[] names = {"홍길동", "유관순", "이순신"};
        System.out.println("names의 hashCode : " + names.hashCode());
        print(names);

        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode());
        print(getAnimals());
        print(animals);
    }

    public static void print(String[] sarr){
        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for(int i = 0; i < sarr.length; i++){
            System.out.println(sarr[i] + " ");
        }
    }

    public static String[] getAnimals() {
        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
        System.out.println("새로 만든 animals hashCode : " + animals.hashCode());
        return animals; //getAnimals 라는 함수를 호출하면 String 배열 타입의 주소값을 반환하겠다.
    }
}
