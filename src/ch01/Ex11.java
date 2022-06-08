package ch01;

import java.util.Scanner;

public class Ex11 {
    public static String Solution(String a){

        String answer="";
        a=a+"";
        int count=1;


        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i)==a.charAt(i+1))
                count++;
            else{
                answer+=a.charAt(i);
                if(count>1) answer+=String.valueOf(count);
                count=1;
            }
        }
        return answer;
    }




        public static void main (String[]args){


         Scanner sc=new Scanner(System.in);
         String b=sc.next();
            System.out.println(Solution(b));

        }
    }
