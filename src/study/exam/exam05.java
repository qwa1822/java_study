package study.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam05 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int[] ballArr={1,2,3,4,5,6,7,8,9};
        int[] ball3=new int[3];

        for(int i=0; i<ballArr.length; i++){
            int j=(int)(Math.random()*ballArr.length);
            int tmp=0;


            tmp=ballArr[0];
            ballArr[0]=ballArr[j];
            ballArr[j]=tmp;




        }

        System.arraycopy(ballArr,0,ball3,0,3);

        for(int i=0; i<ball3.length; i++){
            System.out.print(ball3[i]);
        }






    }
}
