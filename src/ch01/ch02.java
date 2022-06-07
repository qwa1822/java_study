package ch01;

import java.util.Locale;
import java.util.Scanner;

public class ch02 {
    public static String Solution(String str) {




        //아스키넘버
        //대문자는 65~90
        //소문자 97~122
        String answer = "";
//            EX01
//        for (char x : str.toCharArray()) {
//            //str을 일단 character 화시킴.
//            if (Character.isLowerCase(x))
//                answer += Character.toUpperCase(x);
//
//            //x를 대문자화
//            else
//                answer += Character.toLowerCase(x);
//                //x 를 소문자화
//
//        }

        //EX02

        for(char x:str.toCharArray()){
            if(x>=97 && x<=122)
               answer+=(char)(x-32);
            else
                answer+=(char)(x+32);

        }



        return answer;

    }




    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        System.out.println(Solution(str));

    }
}
