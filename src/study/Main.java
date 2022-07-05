package study;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


   int input=0, answer=0;
    Scanner sc=new Scanner(System.in);

   answer=(int)(Math.random()*100)+1;
        System.out.println(answer);
        
        
        do{
            System.out.println("1과 100사이의 정수를 입력하세요");
            input=sc.nextInt();
            
            if(input>answer){
                System.out.println("더 작은수로");
            }
            else if(input<answer){
                System.out.println("더 큰수로!");
            }
        }while(input!=answer);
        System.out.println("정답");


    }
}