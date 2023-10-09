package com.ohjiraffers.section02.dementional;

public class Application4 {
    public static void main(String[] args) {
        /*{}이용해서 배열을 생성
        * 2차원 배열도 할당과 동시에 JVM기본값 외의 값을 초기화하고 싶은 경우
        * 리터럴을 이용할 수 있다.
        * */

        //1.정변배열
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for(int i = 0; i < iarr.length; i++){
            for(int j = 0; j < iarr[i].length; j++){
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*2. 가변배열 */
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for(int i = 0; i < iarr2.length; i++){
            for(int j = 0; j < iarr2[i].length; j++){
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[][] iarr3 = {arr1, arr2};

        for(int i = 0; i < iarr3.length; i++){
            for(int j = 0; j < iarr3[i].length; j++){
                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //깊은 복사: 주소값은 다르지만 값은 동일한 경우
        //얕은 복사: 주소값이 같고 값도 같은 경우

    }
}
