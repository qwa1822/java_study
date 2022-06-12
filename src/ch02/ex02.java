package ch02;

import java.util.Scanner;

public class ex02 {
    public static int Solution(int i,int[]arr) {

        int answer = 1, max = arr[0];
        for (int a = 1; a < i; a++) {
            if (arr[a] > max){
                answer++;
            max = arr[a];
        }
    }
        return answer;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int[]arr=new int[i];

        for(int a=0; a<i; a++){
            arr[a]=sc.nextInt();
        }

        System.out.println(Solution(i,arr));
    }
}
