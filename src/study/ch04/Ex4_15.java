package study.ch04;

import ch01.Main;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {

        int input=0, answer=0;

        answer=(int)(Math.random()*100)+1;
        Scanner sc=new Scanner(System.in);
        
        
        do {
            System.out.println("1과 100사이의 정수를 입력하세요");
            input = sc.nextInt();


            if (input > answer) {
                System.out.println("더 작은수로 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰수로 입력하세요");
            }
        }while(input!=answer);

        System.out.println("정답입니다.");
    }
}
