package ch01;

import java.util.Scanner;

public class Ex03 {
    public static String Solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE,pos;  //가장 작은 값으로 초기화
//        String[] s=str.split(" ");
//        for(String x:s){
//            int len=x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }

        while((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }


            str = str.substring(pos + 1);
        }

        if(str.length()>m) answer=str;








        return answer;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();   //문장 한줄을 입력받아야되기 떄문에.

        System.out.println(Solution(str));
    }
}
