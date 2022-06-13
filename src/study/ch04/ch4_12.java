package study.ch04;

import java.util.Scanner;

public class ch4_12 {
    public static void main(String[] args) {


        for(int i=1; i<=20; i++){
//            System.out.println((int)(Math.random()*10));   //0부터 ~9
//            System.out.println((int)(Math.random()*10+1));   //1부터 10까지 1<=x<=11, 1~0
            System.out.println((int)(Math.random()*11)-5);   //0<=x<=11, 0~10 -5~5


        }

    }
}
