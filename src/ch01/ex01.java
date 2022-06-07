package ch01;

import sun.applet.Main;

import java.util.Scanner;

public class ex01 {

    public static int solutin(String str, char t){
        int answer=0;


        str=str.toUpperCase();
        t=Character.toUpperCase(t);



//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t)
//                answer++;
//        }

        //향상된 for문

        for(char x:str.toCharArray()){     //String 을 문자하나하나  배열로 만들어야됨
                                        //그것을 toCharArray() 라고함  그것을 스트링을 기반으로해
                                        //문자배열을 생성함.
            if(x==t)
                answer++;


        }



        return answer;

    }
    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        char c=sc.next().charAt(0);   //String 의 0번쨰있는거를 갖고와라
                                        // sc.next()은 스트링형식이기 떄문에 하나만리턴함





        System.out.println(solutin(str,c));




    }
}
