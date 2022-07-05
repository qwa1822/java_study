package ch02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {

    public ArrayList<Integer> Solution(int n,int[]arr){
        ArrayList<Integer> answer=new ArrayList<>();

        answer.add(arr[0]);

        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {

        ex01 T=new ex01();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int ace[]=new int[n];

        for(int i=0; i<n; i++){
            ace[i]=sc.nextInt();

        }
        for(int x:T.Solution(n,ace)){
            System.out.print(x+" ");
        }

    }
}
