package study.exam11;

import java.util.Scanner;

public class ddp {


    public static void main(String[] args) {


        String[] words={"televsiion","computer","mouse","phone"};


        Scanner sc=new Scanner(System.in);


        for(int i=0; i<words.length; i++){

            char[] question=words[i].toCharArray();



            for(int j=0; j<question.length; j++){


                char temp;
                int change=(int)(Math.random()*question.length);
                temp=question[j];
                question[j]=question[change];
                question[change]=temp;
            }
        }
    }
}
