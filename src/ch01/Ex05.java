package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

    public static String Solution(String str) {


        String answer;
        char[] s=str.toCharArray();  //문자배열 생성.
        int lt=0, rt=str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt]))lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }


        }
                        //반환값이 String 값이기떄문에
        answer=String.valueOf(s);   //String 화 시켜줘야함

        return answer;
    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(Solution(str));



    }
}
