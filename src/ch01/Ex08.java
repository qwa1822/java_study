package ch01;

import java.util.Scanner;

public class Ex08 {

    public static String Solution(String s){


        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]"," "); //대문자A-Z까지 아니면
        //빈문자화 시켜버려라.
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";





        return answer;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();


        System.out.println(Solution(s));
    }
}
