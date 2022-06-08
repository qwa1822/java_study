package ch01;

import java.util.Scanner;

public class Ex10 {


    public int[] Solution(String s,char c){

        int []answer=new int[s.length()];   //길이가 11
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                p=0;
                answer[i]=p;

            }
            else{
                p++;
                answer[i]=p;
            }
        }

        p=1000;
        
        //제일 끝에서부터 시작
        for(int i=s.length()-1; i>0; i--){
            if(s.charAt(i)==c)
                p=0;

            else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }




        return answer;
    }

    public static void main(String[] args) {


        Ex10 T=new Ex10();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char c=sc.next().charAt(0);

        for(int x:T.Solution(str,c)){
            System.out.println(x);
        }
    }
}
