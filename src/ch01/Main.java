package ch01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> Solution(int n,int[]ac) {
        ArrayList<Integer> in = new ArrayList<>();

        in.add(ac[0]);

        for (int i = 1; i < n; i++) {
            if (ac[i] > ac[i - 1]) {
                in.add(ac[i]);
            }

        }

        return in;
    }



    public static void main(String[] args) {



        Main T=new Main();
     Scanner sc=new Scanner(System.in);

     int i=sc.nextInt();
     int ace[]=new int[i];

     for(int a=0; a<i; a++){
         ace[a]=sc.nextInt();

     }

     for(int cc:T.Solution(i,ace)){
         System.out.print(cc+" ");
     }

    }
}