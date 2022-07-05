package ch01;

import java.util.Scanner;

public class Ex09 {

    public static int Solution(String a) {


        //Ex01

//        String answer="";
//
////        for(char x:a.toCharArray()){    // for-each char화 시켜줌.
////            if(Character.isDigit(x)) {  //isDIgit 숫자냐고 물어보는것
////                answer+=x;
////
////            }
////
////        }
//
//
//
//
//        return Integer.parseInt(answer);
//
//    }




        int answer=0;


        for(char b:a.toCharArray()){
            if(b>=48 && b<=57){
                answer=answer*10+(b-48);
            }
        }

        return answer;


    }



    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        System.out.println(Solution(a));

    }
}
