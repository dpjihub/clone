package com.ohjiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {
        //랜덤한 카드를 한 장 뽑아서 출력

        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shape.length); // 0 1 2 3 중 하나
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length);

        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex] + "카드 입니다.");

    }
}
