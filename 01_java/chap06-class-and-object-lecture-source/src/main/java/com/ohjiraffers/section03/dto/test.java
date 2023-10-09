package com.ohjiraffers.section03.dto;

public class test {
    public static void main(String[] args) {
        String[][] arr = {{"1","2","3","4","5"},{"6","7","8","9","10"}};

        for(String[] arrs : arr) {
            for(String s : arrs) {
                System.out.println(s);
            }
        }
    }
}
