package ch06;

import java.util.Scanner;

public class ch5_6 {
    public static void main(String[] args) {


        String[] words={"television","computer","mouse","phone"};

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<words.length; i++){
            char[] question=words[i].toCharArray();

            int j=(int)(Math.random()*question.length);

            char temp=question[0];
            question[0]=question[j];
            question[j]=temp;


            System.out.printf("Q%d . %s의 정답을 입력하세요>",
                    i+1,new String(question));
            String answer=sc.nextLine();


            if(words[i].equals(answer.trim()))
                System.out.println("맞았습니다.\n\n");
            else
                System.out.println("틀렸습니다.\n\n");
        }
    }
}
