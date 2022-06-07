package ch01;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static String Solution(String s){


        String answer="NO";
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(tmp)) answer="YES";



//        s=s.toUpperCase();
//        int len=s.length();
//        for(int i=0; i<len/2; i++){
//            if(s.charAt(i)!=s.charAt(len-i-1)) return "NO";
//        }


        return answer;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Solution(s));

    }

}
