package ch02;

import java.util.Scanner;

public class ex05 {
    public static int Solution(int n){

        int ace[]=new int[n+1];
        int answer=0;
        for(int j=2; j<=n; j++){
            if(ace[j]==0)
            answer++;

            for(int c=j; c<=n; c=j+c){
                ace[c]=1;
            }
        }

        return answer;
    }



    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        System.out.println(Solution(i));

    }
}
