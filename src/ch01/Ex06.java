package ch01;

import java.util.Scanner;

public class Ex06 {
    public static String Solution(String s){


        String answer="";

        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i))==i){
                answer+=s.charAt(i);
            }

        }





        return answer;
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        String s=sc.next();


        System.out.println(Solution(s));
    }
}
