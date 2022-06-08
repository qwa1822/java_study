package ch01;

import java.util.Scanner;

public class Ex12 {


    public String Solution(int n, String s){


        String answer="";

        for(int i=0; i<n; i++){
            String tmp=s.substring(0,7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp,2);
            answer+=(char)num;
            System.out.println(tmp+" "+num);
            s=s.substring(7);

        }



        return answer;
    }
    public static void main(String[] args) {

        Ex12 T=new Ex12();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(T.Solution(n,s));

    }
}
