package study.exam;

public class exam02 {
    public static void main(String[] args) {

        int answer=(int)(Math.random()*100)+1;
        System.out.println(answer);

        int input=0;
        int count=0;




        java.util.Scanner s=new java.util.Scanner(System.in);


        do{
            count++;
            System.out.println("1과 100사이의 값을 입력하세요!");
            input=s.nextInt();

            if(input>answer){
                System.out.println("작은 값을 입력하세요.ㅣ");
            }
            else if(input<answer){
                System.out.println("더 큰값을 입력하세요!");
            }
            if(input==answer){
                System.out.println("맞았습니다 시도횟수는"+count);
            }
        }while(true);

    }
}
