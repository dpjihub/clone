package com.ohjiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        /*선택정렬
        * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
        * 데이터의 양이 적을 때 좋은 성능을 나타낸다(교환횟수가 적음).
        * */

        int[] iarr = {2, 5, 4, 6, 1, 3};

        int min; //최소값을 가진 데이터의 인덱스 저장 변수
        int temp; //임시저장 변수

        for(int i = 0; i < iarr.length - 1; i++){
            min = i;
            for(int j = i + 1; j < iarr.length; j++){

                if(iarr[min] > iarr[j]){
                    min = j;
                }
            }
            // 작은 값을 시작 인덱스와 교환
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
        }
    }
}
