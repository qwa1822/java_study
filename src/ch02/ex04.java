package ch02;

import java.util.Scanner;

public class ex04 {
    public static int[] Solution(int n){

        int get[]=new int[n];
        get[0]=1;
        get[1]=1;

        for(int i=2; i<n; i++){
            get[i]=get[i-2]+get[i-1];
        }


        return get;
    }


    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int x:Solution(n)){
            System.out.print(x+" ");
        }
    }




}
