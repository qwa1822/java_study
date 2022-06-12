package ch02;

import java.util.Scanner;

public class ex03 {
    public static String Solution(int i,int a[],int b[]){

        String answer="";


        for(int j=0; j<i; j++){
            if(a[j]==b[j]) answer+="D";
            else if(a[j]==1 && b[j]==3) answer+="A";
            else if(a[j]==2 && b[j]==1) answer+="A";
            else if(a[j]==3 && b[j]==2) answer+="A";
            else{
                answer+="B";
            }
        }
        return answer;

    }



    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        int a[]=new int[i];
        int b[]=new int[i];


        for(int c=0; c<i; c++){
            a[c]=sc.nextInt();
        }
        for(int c=0; c<i; c++) {
            b[c] = sc.nextInt();
        }


        System.out.println(Solution(i,a,b));
    }
}
