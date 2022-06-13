package study.ch04;

import java.util.Scanner;

public class ch4_16 {
    public static void main(String[] args) {

        System.out.println(12345%10);  //마지막 자리만 얻음
        
        
        int num=0, sum=0;
        System.out.println("숫자를 입력하세요");
        Scanner sc=new Scanner(System.in);

        String tmp=sc.nextLine();
        num=Integer.parseInt(tmp);

        while(num!=0){
            sum+=num%10;   // num을 10으로 나눈 나머지를 sum에 더함.
            System.out.printf("sum=%3d num=%d\n",sum,num);
            num/=10;     // num을 10으로 나눈값

        }

        System.out.println("각 자리수의 합"+sum);
    }
}
