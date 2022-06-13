package study.ch04;

import java.util.Scanner;

public class ch4_13 {
    public static void main(String[] args) {

        int i;   //scope(범위)`
        

        for(i=1; i<=10; i++){   //괄호{} 안의 문장을 5번 반복
            System.out.println("i="+i);

        }
        System.out.println(i);
    }
}
