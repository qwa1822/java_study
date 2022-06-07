package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

    public ArrayList<String> solution(int nm,String[]str){
        ArrayList<String> answer=new ArrayList<>();

//        for(String x:str){
//            String tmp=new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }


        for(String x:str){
            char [] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }


        return answer;
    }
    public static void main(String[] args) {

        Ex04 T=new Ex04();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] str=new String[n];

        for(int i=0; i<n; i++){
            str[i]=sc.next();

        }
        for(String x:T.solution(n,str)){
            System.out.println(x);
        }
    }
}
