package com.ohjiraffers.section05.parameter;

public class RectAngle {

    private double width;
    private double height;

    //alt + insert 하여 생성자와 게터세터 설정.
    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("이 사각형의 넓이는 " + area + "입니다.");
    }
    public void calcRound(){
        double round = (width + height)/2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다.");
    }
}
