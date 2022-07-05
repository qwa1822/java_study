package study.exam;

import java.util.Scanner;

public class exam06 {

    public static void main(String[] args) {


        String[] words={"television","computer","mouse","phone"};

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<words.length; i++){
            char[] q=words[i].toCharArray();


            int change=(int)(Math.random()*q.length);

            char temp=q[i];
            q[i]=q[change];
            q[change]=temp;


            System.out.printf("Q%d. %s의 정답을 입력하세요>",
                    i+1,new String(q));


            String answer=sc.nextLine();


            if(words[i].equals(answer.trim()))
                System.out.println("맞았습니다\n");
            else
                System.out.println("틀렸습니다.");

        }
    }
}
